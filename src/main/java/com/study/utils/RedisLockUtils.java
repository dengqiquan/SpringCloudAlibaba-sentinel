package com.study.utils;

import cn.hutool.core.util.RandomUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.redis.connection.ReturnType;
import org.springframework.data.redis.core.RedisCallback;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.RedisSerializer;

import java.util.concurrent.TimeUnit;

/**
 * @description: redis 分布式锁
 * @author: Deng Qi Qua_n
 * @date: 2021/2/26 13:50
 */
public class RedisLockUtils {

    private static final Logger log = LoggerFactory.getLogger(RedisLockUtils.class);
    private RedisTemplate<String, Object> redisTemplate;
    private String lockKey;
    private String lockValue;
    private int timeOutMill;
    public static final String UNLOCK_LUA;

    public RedisLockUtils(RedisTemplate<String, Object> redisTemplate, String lockKey, int timeOutMill) {
        this.redisTemplate = redisTemplate;
        this.lockKey = lockKey + "_redis_lock";
        this.timeOutMill = timeOutMill;
        this.lockValue = RandomUtil.randomString(20);
    }

    public boolean getRedisLock() {
        return this.redisTemplate.opsForValue().setIfAbsent(this.lockKey, this.lockValue, (long)this.timeOutMill, TimeUnit.MILLISECONDS);
    }

    public boolean releaseLock() {
        RedisSerializer keySerializer = this.redisTemplate.getKeySerializer();
        RedisSerializer valueSerializer = this.redisTemplate.getValueSerializer();
        RedisCallback<Boolean> callback = (connection) -> {
            return (Boolean)connection.eval(UNLOCK_LUA.getBytes(), ReturnType.BOOLEAN, 1, new byte[][]{keySerializer.serialize(this.lockKey), valueSerializer.serialize(this.lockValue)});
        };
        return (Boolean)this.redisTemplate.execute(callback);
    }

    static {
        StringBuilder sb = new StringBuilder();
        sb.append("if redis.call(\"get\",KEYS[1]) == ARGV[1] ");
        sb.append("then ");
        sb.append("    return redis.call(\"del\",KEYS[1]) ");
        sb.append("else ");
        sb.append("    return 0 ");
        sb.append("end ");
        UNLOCK_LUA = sb.toString();
    }
}

package com.study.controller;

import com.study.common.RedisLockConstant;
import com.study.common.Result;
import com.study.domain.search.SysDeptSearch;
import com.study.service.SysDeptService;
import com.study.utils.RedisLockUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.concurrent.TimeUnit;

/**
 * @description:
 * @author: Deng Qi Qua_n
 * @date: 2021/2/25 14:14
 */
@RestController
@RequestMapping(value =  "/dept")
@Slf4j
public class SysDeptController {

    @Resource
    private RedisTemplate redisTemplate;

    @Resource
    private SysDeptService sysDeptService;

    @PostMapping("/get/list")
    public Result getDeptList(){
        return Result.success(sysDeptService.getDeptList());
    }

    @PostMapping("/get/page/list")
    public Result getDeptPageList(@RequestBody SysDeptSearch sysDeptSearch){
        return Result.success(sysDeptService.getDeptPageList(sysDeptSearch));
    }

    @PostMapping("/get/redis/lock")
    public Result getRedisLock(@RequestBody SysDeptSearch sysDeptSearch) throws InterruptedException {
        String lockKey = sysDeptSearch.getLock() + "locked";
        RedisLockUtils redisLockUtils = new RedisLockUtils(redisTemplate,lockKey, RedisLockConstant.timeOut);
        boolean redisLock = redisLockUtils.getRedisLock();
        if(redisLock){
            log.info("获取锁成功");
            Thread.sleep(TimeUnit.SECONDS.toSeconds(1));
        }else {
            log.info("获取锁失败");
        }
        return Result.success();
    }

}

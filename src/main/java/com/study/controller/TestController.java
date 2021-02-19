package com.study.controller;

import com.study.common.Result;
import com.study.config.RedissonConfig;
import lombok.extern.slf4j.Slf4j;
import org.redisson.Redisson;
import org.redisson.api.RLock;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @description:
 * @author: Deng Qi Qua_n
 * @date: 2021/1/26 10:46
 */
@RestController
@RequestMapping(value =  "/test")
@Slf4j
public class TestController {

    static Integer GOOD_NUM = 20;

    @Value("${stephen.curry}")
    private Integer num;

    static final String GOOD_LOCK = "GOOD_LOCK";

    @Resource
    private RedissonConfig redissonConfig;

    @RequestMapping("/one")
//    @SentinelResource("one")
    public Result getTest(){
        return Result.success("鸭儿了");
    }

    @RequestMapping("/two")
    public Result testTwo(){
        int a = 1 / 0;
        return Result.success(num);
    }

    @GetMapping("/redis/lock")
    public Result redisLock(@RequestParam("goodId") String goodId){
        Result result = new Result<>(500,"操作失败");
        Redisson redisson = redissonConfig.getRedisson();
        log.info(GOOD_LOCK + goodId);
        RLock lock = redisson.getLock(GOOD_LOCK + goodId);
        try {
            boolean tryLock = lock.tryLock();
            if (tryLock) {
                if(GOOD_NUM >0 ){
                    log.info("获得了锁开始执行业务-------------");
                    GOOD_NUM--;
                    Thread.sleep(1000);
                    result.setCode(200);
                    log.info("商品还剩"+GOOD_NUM);
                    result.setMsg("操作成功");
                    log.info("完成业务执行-------------");
                    lock.unlock();
                }else {
                    log.info("商品没了---------------");
                }
            } else {
                log.info("获得获取锁失败-------------");
                result.setMsg("执行中请稍后操作----------");
            }
            return result;
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            if(lock != null && lock.isHeldByCurrentThread()){
                lock.unlock();
            }
        }
        return result;
    }
}

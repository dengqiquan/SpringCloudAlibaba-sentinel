package com.study.controller;

import com.alibaba.fastjson.JSONObject;
import com.study.common.Result;
import com.study.entity.SysUser;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @description:
 * @author: Deng Qi Qua_n
 * @date: 2021/3/1 14:36
 */
@RestController
@Slf4j
public class KafkaController {

    @Resource
    KafkaTemplate<String,Object> kafkaTemplate;

    @PostMapping("/postMessage")
    public Result sendMessage(){
        SysUser user = new SysUser();
        user.setUsername("stephen");
        log.info("发送消息:"+JSONObject.toJSONString(user));
        kafkaTemplate.send("iris", JSONObject.toJSONString(user));
        log.info("发送消息kafka----success");
        return Result.success("发送成功");
    }

}

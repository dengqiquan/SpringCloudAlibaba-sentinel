package com.study.controller;

import com.study.common.Result;
import com.study.entity.SysUser;
import com.study.service.SysUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @description:
 * @author: Deng Qi Qua_n
 * @date: 2021/2/25 13:42
 */
@RestController
@RequestMapping(value =  "/sys")
@Slf4j
public class SystemUserController {

    @Resource
    private SysUserService sysUserService;

    @GetMapping("/find/by/{id}")
    public Result findById(@PathVariable("id") Integer id) {
       SysUser sysUser =  sysUserService.findById(id);
        return Result.success(sysUser);
    }
}

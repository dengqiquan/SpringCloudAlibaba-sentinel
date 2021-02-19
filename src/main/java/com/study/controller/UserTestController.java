package com.study.controller;

import com.study.common.Result;
import com.study.domain.dto.UserDto;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * @description:
 * @author: Deng Qi Qua_n
 * @date: 2021/1/26 13:52
 */
@RestController
@RequestMapping("/user")
public class UserTestController {

    @PostMapping("/is/phone")
    public Result validatePhone(@RequestBody @Valid UserDto userDto){
        return Result.success(userDto.getPhone());
    }
}

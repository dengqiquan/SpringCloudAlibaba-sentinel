package com.study.config;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.alibaba.fastjson.JSONObject;
import com.study.common.Result;
import org.springframework.validation.BindException;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.List;

/**
 * @description:全局异常捕获
 * @author: Deng Qi Qua_n
 * @date: 2021/1/26 15:00
 */
@RestControllerAdvice
public class GlobalExceptionHandler {
    /**
     * 注解异常拦截
     * @param e
     * @return
     */
    @ExceptionHandler(value = MethodArgumentNotValidException.class)
    public Result exception(MethodArgumentNotValidException e) {
        List<ObjectError> errorList=e.getBindingResult().getAllErrors();
        String error="";
        for (ObjectError objectError : errorList) {
            error=objectError.getDefaultMessage();
        }
        return new Result(500, error);
    }

//    /**
//     * 运行异常拦截
//     * @param e
//     * @return
//     */
//    @ExceptionHandler(value = Exception.class)
//    public Result exception(Exception e) {
//        return new Result(500, e.getMessage());
//    }

    @ResponseBody
    @ExceptionHandler(value = BlockException.class)
    public JSONObject blockExceptionHandler(BlockException blockException) {
        return new JSONObject().fluentPut("code", 1024)
                .fluentPut("msg", "请求被拦截，拦截类型为 " + blockException.getClass().getSimpleName());
    }

}

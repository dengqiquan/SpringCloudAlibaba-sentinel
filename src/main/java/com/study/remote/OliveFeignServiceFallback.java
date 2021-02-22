package com.study.remote;

import com.study.common.Result;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

/**
 * @description:
 * @author: Deng Qi Qua_n
 * @date: 2021/2/20 15:04
 */
@Slf4j
public class OliveFeignServiceFallback implements OliveFeignService{

    @Setter
    private Throwable cause;

    @Override
    public Result sentinelTest() {
        return Result.fail("服务熔断");
    }
}

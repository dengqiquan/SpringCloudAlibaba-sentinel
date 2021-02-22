package com.study.remote;

import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

/**
 * @description:
 * @author: Deng Qi Qua_n
 * @date: 2021/2/20 15:09
 */
@Component
public class FeignFactory implements FallbackFactory<OliveFeignService> {

    @Override
    public OliveFeignService create(Throwable throwable) {
        OliveFeignServiceFallback accountFeignFallback = new OliveFeignServiceFallback();
        accountFeignFallback.setCause(throwable);
        return accountFeignFallback;
    }
}

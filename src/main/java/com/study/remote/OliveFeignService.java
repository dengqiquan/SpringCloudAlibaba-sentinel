package com.study.remote;

import com.study.common.Result;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @description:
 * @author: Deng Qi Qua_n
 * @date: 2021/2/19 16:17
 */
@FeignClient(name = "olive-sentinel-client",fallbackFactory = FeignFactory.class)
public interface OliveFeignService {
    /**
     * sentinelTest
     * @return
     */
    @GetMapping(value = "test",consumes = MediaType.APPLICATION_JSON_VALUE)
    Result sentinelTest();
}

package com.study.service.impl;

import com.study.dao.ToolLocalStorageDao;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import com.study.service.ToolLocalStorageService;
import org.springframework.stereotype.Service;

/**
 * 本地存储服务接口实现
 *
 * @author dengqiquan
 * @since 2021-02-24 15:12:57
 * @description 由 Mybatisplus Code Generator 创建
 */
@Slf4j
@RequiredArgsConstructor
@Service
public class ToolLocalStorageServiceImpl implements ToolLocalStorageService {
    private final ToolLocalStorageDao toolLocalStorageDao;

}
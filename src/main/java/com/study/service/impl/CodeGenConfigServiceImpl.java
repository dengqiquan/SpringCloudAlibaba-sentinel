package com.study.service.impl;

import com.study.dao.CodeGenConfigDao;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import com.study.service.CodeGenConfigService;
import org.springframework.stereotype.Service;

/**
 * 代码生成器配置服务接口实现
 *
 * @author dengqiquan
 * @since 2021-02-24 15:12:57
 * @description 由 Mybatisplus Code Generator 创建
 */
@Slf4j
@RequiredArgsConstructor
@Service
public class CodeGenConfigServiceImpl implements CodeGenConfigService {
    private final CodeGenConfigDao codeGenConfigDao;

}
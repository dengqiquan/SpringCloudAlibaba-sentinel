package com.study.service.impl;

import com.study.dao.ToolEmailConfigDao;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import com.study.service.ToolEmailConfigService;
import org.springframework.stereotype.Service;

/**
 * 邮箱配置服务接口实现
 *
 * @author dengqiquan
 * @since 2021-02-24 15:12:57
 * @description 由 Mybatisplus Code Generator 创建
 */
@Slf4j
@RequiredArgsConstructor
@Service
public class ToolEmailConfigServiceImpl implements ToolEmailConfigService {
    private final ToolEmailConfigDao toolEmailConfigDao;

}
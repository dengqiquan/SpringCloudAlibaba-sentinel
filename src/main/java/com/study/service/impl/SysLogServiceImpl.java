package com.study.service.impl;

import com.study.dao.SysLogDao;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import com.study.service.SysLogService;
import org.springframework.stereotype.Service;

/**
 * 系统日志服务接口实现
 *
 * @author dengqiquan
 * @since 2021-02-24 15:12:57
 * @description 由 Mybatisplus Code Generator 创建
 */
@Slf4j
@RequiredArgsConstructor
@Service
public class SysLogServiceImpl implements SysLogService {
    private final SysLogDao sysLogDao;

}
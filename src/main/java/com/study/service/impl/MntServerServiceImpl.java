package com.study.service.impl;

import com.study.dao.MntServerDao;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import com.study.service.MntServerService;
import org.springframework.stereotype.Service;

/**
 * 服务器管理服务接口实现
 *
 * @author dengqiquan
 * @since 2021-02-24 15:12:57
 * @description 由 Mybatisplus Code Generator 创建
 */
@Slf4j
@RequiredArgsConstructor
@Service
public class MntServerServiceImpl implements MntServerService {
    private final MntServerDao mntServerDao;

}
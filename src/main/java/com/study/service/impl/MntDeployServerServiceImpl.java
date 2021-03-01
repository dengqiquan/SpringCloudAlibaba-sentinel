package com.study.service.impl;

import com.study.dao.MntDeployServerDao;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import com.study.service.MntDeployServerService;
import org.springframework.stereotype.Service;

/**
 * 应用与服务器关联服务接口实现
 *
 * @author dengqiquan
 * @since 2021-02-24 15:12:57
 * @description 由 Mybatisplus Code Generator 创建
 */
@Slf4j
@RequiredArgsConstructor
@Service
public class MntDeployServerServiceImpl implements MntDeployServerService {
    private final MntDeployServerDao mntDeployServerDao;

}
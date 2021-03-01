package com.study.service.impl;

import com.study.dao.SysUserDao;
import com.study.entity.SysUser;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import com.study.service.SysUserService;
import org.springframework.stereotype.Service;

/**
 * 系统用户服务接口实现
 *
 * @author dengqiquan
 * @since 2021-02-24 15:12:57
 * @description 由 Mybatisplus Code Generator 创建
 */
@Slf4j
@RequiredArgsConstructor
@Service
public class SysUserServiceImpl implements SysUserService {
    private final SysUserDao sysUserDao;


    @Override
    public SysUser findById(Integer id) {
        return sysUserDao.getById(id);
    }
}
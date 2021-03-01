package com.study.service;


import com.study.entity.SysUser;

/**
 * 系统用户服务接口
 *
 * @author dengqiquan
 * @since 2021-02-24 15:12:57
 * @description 由 Mybatisplus Code Generator 创建
 */
public interface SysUserService {
    /**
     * 根据id查找
     * @param id
     * @return
     */
    SysUser findById(Integer id);
}

package com.study.dao;

import lombok.extern.slf4j.Slf4j;
import com.study.entity.SysUser;
import com.study.mapper.SysUserMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Repository;

/**
 * 系统用户(sys_user)数据DAO
 *
 * @author dengqiquan
 * @since 2021-02-24 15:12:57
 * @description 由 Mybatisplus Code Generator 创建
 */
@Slf4j
@Repository
public class SysUserDao extends ServiceImpl<SysUserMapper, SysUser> {

}
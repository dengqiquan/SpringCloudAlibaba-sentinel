package com.study.dao;

import lombok.extern.slf4j.Slf4j;
import com.study.entity.MntDeployServer;
import com.study.mapper.MntDeployServerMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Repository;

/**
 * 应用与服务器关联(mnt_deploy_server)数据DAO
 *
 * @author dengqiquan
 * @since 2021-02-24 15:12:57
 * @description 由 Mybatisplus Code Generator 创建
 */
@Slf4j
@Repository
public class MntDeployServerDao extends ServiceImpl<MntDeployServerMapper, MntDeployServer> {

}
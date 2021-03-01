package com.study.dao;

import lombok.extern.slf4j.Slf4j;
import com.study.entity.SysQuartzLog;
import com.study.mapper.SysQuartzLogMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Repository;

/**
 * 定时任务日志(sys_quartz_log)数据DAO
 *
 * @author dengqiquan
 * @since 2021-02-24 15:12:57
 * @description 由 Mybatisplus Code Generator 创建
 */
@Slf4j
@Repository
public class SysQuartzLogDao extends ServiceImpl<SysQuartzLogMapper, SysQuartzLog> {

}
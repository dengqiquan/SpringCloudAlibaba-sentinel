package com.study.dao;

import lombok.extern.slf4j.Slf4j;
import com.study.entity.CodeGenConfig;
import com.study.mapper.CodeGenConfigMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Repository;

/**
 * 代码生成器配置(code_gen_config)数据DAO
 *
 * @author dengqiquan
 * @since 2021-02-24 15:12:57
 * @description 由 Mybatisplus Code Generator 创建
 */
@Slf4j
@Repository
public class CodeGenConfigDao extends ServiceImpl<CodeGenConfigMapper, CodeGenConfig> {

}
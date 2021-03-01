package com.study.dao;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.study.domain.search.SysDeptSearch;
import lombok.extern.slf4j.Slf4j;
import com.study.entity.SysDept;
import com.study.mapper.SysDeptMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * 部门(sys_dept)数据DAO
 *
 * @author dengqiquan
 * @since 2021-02-24 15:12:57
 * @description 由 Mybatisplus Code Generator 创建
 */
@Slf4j
@Repository
public class SysDeptDao extends ServiceImpl<SysDeptMapper, SysDept> {

    @Resource
    SysDeptMapper sysDeptMapper;

    public IPage<SysDept> getDeptPageList(Page<SysDept> page, SysDeptSearch sysDeptSearch) {
        return sysDeptMapper.getDeptPageList(page, sysDeptSearch);
    }
}
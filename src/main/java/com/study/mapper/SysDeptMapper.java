package com.study.mapper;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.study.domain.search.SysDeptSearch;
import com.study.entity.SysDept;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * 部门(sys_dept)数据Mapper
 *
 * @author dengqiquan
 * @since 2021-02-24 15:12:57
 * @description 由 Mybatisplus Code Generator 创建
*/
@Mapper
public interface SysDeptMapper extends BaseMapper<SysDept> {
    /**
     * 分页列表
     * @param page
     * @param sysDeptSearch
     * @return
     */
    IPage<SysDept> getDeptPageList(Page<SysDept> page, @Param("sysDeptSearch")SysDeptSearch sysDeptSearch);
}

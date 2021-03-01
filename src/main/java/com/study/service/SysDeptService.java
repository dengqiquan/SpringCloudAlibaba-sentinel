package com.study.service;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.study.domain.search.SysDeptSearch;
import com.study.entity.SysDept;

import java.util.List;

/**
 * 部门服务接口
 *
 * @author dengqiquan
 * @since 2021-02-24 15:12:57
 * @description 由 Mybatisplus Code Generator 创建
 */
public interface SysDeptService {
    /**
     * 获取列表
     * @return
     */
    List<SysDept> getDeptList();

    /**
     * 分页list查询
     * @param sysDeptSearch
     * @return
     */
    IPage<SysDept> getDeptPageList(SysDeptSearch sysDeptSearch);
}

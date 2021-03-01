package com.study.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.study.dao.SysDeptDao;
import com.study.domain.search.SysDeptSearch;
import com.study.entity.SysDept;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import com.study.service.SysDeptService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 部门服务接口实现
 *
 * @author dengqiquan
 * @since 2021-02-24 15:12:57
 * @description 由 Mybatisplus Code Generator 创建
 */
@Slf4j
@RequiredArgsConstructor
@Service
public class SysDeptServiceImpl implements SysDeptService {
    private final SysDeptDao sysDeptDao;

    @Override
    public List<SysDept> getDeptList() {
        return sysDeptDao.list(new QueryWrapper<SysDept>().lambda().orderByDesc(SysDept::getCreateTime));
    }

    @Override
    public IPage<SysDept> getDeptPageList(SysDeptSearch sysDeptSearch) {
        Page<SysDept> page = new Page<>(sysDeptSearch.getPageNum(), sysDeptSearch.getPageSize());
        IPage<SysDept> sysDeptIPage = sysDeptDao.getDeptPageList(page, sysDeptSearch);
        return sysDeptIPage;
    }
}
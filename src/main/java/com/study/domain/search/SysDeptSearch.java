package com.study.domain.search;

import com.study.domain.Pageable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @description:
 * @author: Deng Qi Qua_n
 * @date: 2021/2/26 9:47
 */
@Data
@EqualsAndHashCode(callSuper=false)
public class SysDeptSearch extends Pageable {

    private String name;

    private String lock;
}

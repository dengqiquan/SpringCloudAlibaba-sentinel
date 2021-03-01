package com.study.domain;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author XC17335
 */

public class Pageable {

    /**
     * 默认页码
     */
    public static final int DEFAULT_PAGE_NO = 1;
    /**
     * 默认页面大小
     */
    public static final int DEFAULT_PAGE_SIZE = 10;

    @ApiModelProperty("当前页")
    private Integer pageNum;


    @ApiModelProperty("每页个数")
    private Integer pageSize;

    public void setPageSize(Integer pageSize) {
        if(pageSize == null || pageSize == 0){
            pageSize = DEFAULT_PAGE_SIZE;
        }
        this.pageSize = pageSize;
    }

    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        if(pageNum ==null || pageNum == 0){
            pageNum = DEFAULT_PAGE_NO;
        }
        this.pageNum = pageNum;
    }

    public Integer getPageSize() {
        return pageSize;
    }


}
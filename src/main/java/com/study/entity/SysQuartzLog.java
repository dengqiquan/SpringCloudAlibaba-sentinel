package com.study.entity;

import java.io.Serializable;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.util.Date;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * 定时任务日志(sys_quartz_log)实体类
 *
 * @author dengqiquan
 * @since 2021-02-24 15:12:57
 * @description 由 Mybatisplus Code Generator 创建
 */
@Data
@NoArgsConstructor
@Accessors(chain = true)
@TableName("sys_quartz_log")
public class SysQuartzLog extends Model<SysQuartzLog> implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * ID
     */
    @TableId
	private Long logId;
    /**
     * beanName
     */
    private String beanName;
    /**
     * createTime
     */
    private Date createTime;
    /**
     * cronExpression
     */
    private String cronExpression;
    /**
     * exceptionDetail
     */
    private String exceptionDetail;
    /**
     * isSuccess
     */
    private Integer isSuccess;
    /**
     * jobName
     */
    private String jobName;
    /**
     * methodName
     */
    private String methodName;
    /**
     * params
     */
    private String params;
    /**
     * time
     */
    private Long time;

}
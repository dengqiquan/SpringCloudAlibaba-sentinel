package com.study.entity;

import java.io.Serializable;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.util.Date;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * 定时任务(sys_quartz_job)实体类
 *
 * @author dengqiquan
 * @since 2021-02-24 15:12:57
 * @description 由 Mybatisplus Code Generator 创建
 */
@Data
@NoArgsConstructor
@Accessors(chain = true)
@TableName("sys_quartz_job")
public class SysQuartzJob extends Model<SysQuartzJob> implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * ID
     */
    @TableId
	private Long jobId;
    /**
     * Spring Bean名称
     */
    private String beanName;
    /**
     * cron 表达式
     */
    private String cronExpression;
    /**
     * 状态：1暂停、0启用
     */
    private Integer isPause;
    /**
     * 任务名称
     */
    private String jobName;
    /**
     * 方法名称
     */
    private String methodName;
    /**
     * 参数
     */
    private String params;
    /**
     * 备注
     */
    private String description;
    /**
     * 负责人
     */
    private String personInCharge;
    /**
     * 报警邮箱
     */
    private String email;
    /**
     * 子任务ID
     */
    private String subTask;
    /**
     * 任务失败后是否暂停
     */
    private Integer pauseAfterFailure;
    /**
     * 创建者
     */
    private String createBy;
    /**
     * 更新者
     */
    private String updateBy;
    /**
     * 创建日期
     */
    private Date createTime;
    /**
     * 更新时间
     */
    @TableField(update = "now()")
	private Date updateTime;

}
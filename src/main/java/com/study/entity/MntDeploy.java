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
 * 部署管理(mnt_deploy)实体类
 *
 * @author dengqiquan
 * @since 2021-02-24 15:12:57
 * @description 由 Mybatisplus Code Generator 创建
 */
@Data
@NoArgsConstructor
@Accessors(chain = true)
@TableName("mnt_deploy")
public class MntDeploy extends Model<MntDeploy> implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * ID
     */
    @TableId
	private Long deployId;
    /**
     * 应用编号
     */
    private Long appId;
    /**
     * 创建者
     */
    private String createBy;
    /**
     * 更新者
     */
    private String updateBy;
    /**
     * createTime
     */
    private Date createTime;
    /**
     * 更新时间
     */
    @TableField(update = "now()")
	private Date updateTime;

}
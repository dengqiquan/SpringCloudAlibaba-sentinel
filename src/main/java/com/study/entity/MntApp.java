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
 * 应用管理(mnt_app)实体类
 *
 * @author dengqiquan
 * @since 2021-02-24 15:12:57
 * @description 由 Mybatisplus Code Generator 创建
 */
@Data
@NoArgsConstructor
@Accessors(chain = true)
@TableName("mnt_app")
public class MntApp extends Model<MntApp> implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * ID
     */
    @TableId
	private Long appId;
    /**
     * 应用名称
     */
    private String name;
    /**
     * 上传目录
     */
    private String uploadPath;
    /**
     * 部署路径
     */
    private String deployPath;
    /**
     * 备份路径
     */
    private String backupPath;
    /**
     * 应用端口
     */
    private Integer port;
    /**
     * 启动脚本
     */
    private String startScript;
    /**
     * 部署脚本
     */
    private String deployScript;
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
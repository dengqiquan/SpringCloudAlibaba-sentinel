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
 * 数据库管理(mnt_database)实体类
 *
 * @author dengqiquan
 * @since 2021-02-24 15:12:57
 * @description 由 Mybatisplus Code Generator 创建
 */
@Data
@NoArgsConstructor
@Accessors(chain = true)
@TableName("mnt_database")
public class MntDatabase extends Model<MntDatabase> implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * ID
     */
    @TableId
	private String dbId;
    /**
     * 名称
     */
    private String name;
    /**
     * jdbc连接
     */
    private String jdbcUrl;
    /**
     * 账号
     */
    private String userName;
    /**
     * 密码
     */
    private String pwd;
    /**
     * 创建者
     */
    private String createBy;
    /**
     * 更新者
     */
    private String updateBy;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 更新时间
     */
    @TableField(update = "now()")
	private Date updateTime;

}
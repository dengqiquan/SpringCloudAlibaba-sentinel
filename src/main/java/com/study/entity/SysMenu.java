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
 * 系统菜单(sys_menu)实体类
 *
 * @author dengqiquan
 * @since 2021-02-24 15:12:57
 * @description 由 Mybatisplus Code Generator 创建
 */
@Data
@NoArgsConstructor
@Accessors(chain = true)
@TableName("sys_menu")
public class SysMenu extends Model<SysMenu> implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * ID
     */
    @TableId
	private Long menuId;
    /**
     * 上级菜单ID
     */
    private Long pid;
    /**
     * 子菜单数目
     */
    private Integer subCount;
    /**
     * 菜单类型
     */
    private Integer type;
    /**
     * 菜单标题
     */
    private String title;
    /**
     * 组件名称
     */
    private String name;
    /**
     * 组件
     */
    private String component;
    /**
     * 排序
     */
    private Integer menuSort;
    /**
     * 图标
     */
    private String icon;
    /**
     * 链接地址
     */
    private String path;
    /**
     * 是否外链
     */
    private Integer iFrame;
    /**
     * 缓存
     */
    private Integer cache;
    /**
     * 隐藏
     */
    private Integer hidden;
    /**
     * 权限
     */
    private String permission;
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
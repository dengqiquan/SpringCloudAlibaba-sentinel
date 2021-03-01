package com.study.entity;

import java.io.Serializable;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * 角色菜单关联(sys_roles_menus)实体类
 *
 * @author dengqiquan
 * @since 2021-02-24 15:12:57
 * @description 由 Mybatisplus Code Generator 创建
 */
@Data
@NoArgsConstructor
@Accessors(chain = true)
@TableName("sys_roles_menus")
public class SysRolesMenus extends Model<SysRolesMenus> implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 菜单ID
     */
	private Long menuId;
    /**
     * 角色ID
     */
	private Long roleId;

}
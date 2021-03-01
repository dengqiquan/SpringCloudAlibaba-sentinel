package com.study.entity;

import java.io.Serializable;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * 用户角色关联(sys_users_roles)实体类
 *
 * @author dengqiquan
 * @since 2021-02-24 15:12:57
 * @description 由 Mybatisplus Code Generator 创建
 */
@Data
@NoArgsConstructor
@Accessors(chain = true)
@TableName("sys_users_roles")
public class SysUsersRoles extends Model<SysUsersRoles> implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 用户ID
     */
	private Long userId;
    /**
     * 角色ID
     */
	private Long roleId;

}
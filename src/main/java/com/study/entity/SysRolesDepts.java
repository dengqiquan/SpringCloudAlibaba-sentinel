package com.study.entity;

import java.io.Serializable;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * 角色部门关联(sys_roles_depts)实体类
 *
 * @author dengqiquan
 * @since 2021-02-24 15:12:57
 * @description 由 Mybatisplus Code Generator 创建
 */
@Data
@NoArgsConstructor
@Accessors(chain = true)
@TableName("sys_roles_depts")
public class SysRolesDepts extends Model<SysRolesDepts> implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * roleId
     */
	private Long roleId;
    /**
     * deptId
     */
	private Long deptId;

}
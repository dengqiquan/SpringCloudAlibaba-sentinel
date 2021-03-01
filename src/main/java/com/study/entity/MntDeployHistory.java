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
 * 部署历史管理(mnt_deploy_history)实体类
 *
 * @author dengqiquan
 * @since 2021-02-24 15:12:57
 * @description 由 Mybatisplus Code Generator 创建
 */
@Data
@NoArgsConstructor
@Accessors(chain = true)
@TableName("mnt_deploy_history")
public class MntDeployHistory extends Model<MntDeployHistory> implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * ID
     */
    @TableId
	private String historyId;
    /**
     * 应用名称
     */
    private String appName;
    /**
     * 部署日期
     */
    private Date deployDate;
    /**
     * 部署用户
     */
    private String deployUser;
    /**
     * 服务器IP
     */
    private String ip;
    /**
     * 部署编号
     */
    private Long deployId;

}
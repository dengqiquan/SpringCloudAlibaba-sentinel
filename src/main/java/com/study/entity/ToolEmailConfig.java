package com.study.entity;

import java.io.Serializable;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * 邮箱配置(tool_email_config)实体类
 *
 * @author dengqiquan
 * @since 2021-02-24 15:12:57
 * @description 由 Mybatisplus Code Generator 创建
 */
@Data
@NoArgsConstructor
@Accessors(chain = true)
@TableName("tool_email_config")
public class ToolEmailConfig extends Model<ToolEmailConfig> implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * ID
     */
    @TableId
	private Long configId;
    /**
     * 收件人
     */
    private String fromUser;
    /**
     * 邮件服务器SMTP地址
     */
    private String host;
    /**
     * 密码
     */
    private String pass;
    /**
     * 端口
     */
    private String port;
    /**
     * 发件者用户名
     */
    private String user;

}
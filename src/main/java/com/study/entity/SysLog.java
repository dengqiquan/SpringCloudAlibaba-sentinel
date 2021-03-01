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
 * 系统日志(sys_log)实体类
 *
 * @author dengqiquan
 * @since 2021-02-24 15:12:57
 * @description 由 Mybatisplus Code Generator 创建
 */
@Data
@NoArgsConstructor
@Accessors(chain = true)
@TableName("sys_log")
public class SysLog extends Model<SysLog> implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * ID
     */
    @TableId
	private Long logId;
    /**
     * description
     */
    private String description;
    /**
     * logType
     */
    private String logType;
    /**
     * method
     */
    private String method;
    /**
     * params
     */
    private String params;
    /**
     * requestIp
     */
    private String requestIp;
    /**
     * time
     */
    private Long time;
    /**
     * username
     */
    private String username;
    /**
     * address
     */
    private String address;
    /**
     * browser
     */
    private String browser;
    /**
     * exceptionDetail
     */
    private String exceptionDetail;
    /**
     * createTime
     */
    private Date createTime;

}
package com.study.entity;

import java.io.Serializable;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * 七牛云配置(tool_qiniu_config)实体类
 *
 * @author dengqiquan
 * @since 2021-02-24 15:12:57
 * @description 由 Mybatisplus Code Generator 创建
 */
@Data
@NoArgsConstructor
@Accessors(chain = true)
@TableName("tool_qiniu_config")
public class ToolQiniuConfig extends Model<ToolQiniuConfig> implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * ID
     */
    @TableId
	private Long configId;
    /**
     * accessKey
     */
    private String accessKey;
    /**
     * Bucket 识别符
     */
    private String bucket;
    /**
     * 外链域名
     */
    private String host;
    /**
     * secretKey
     */
    private String secretKey;
    /**
     * 空间类型
     */
    private String type;
    /**
     * 机房
     */
    private String zone;

}
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
 * 七牛云文件存储(tool_qiniu_content)实体类
 *
 * @author dengqiquan
 * @since 2021-02-24 15:12:57
 * @description 由 Mybatisplus Code Generator 创建
 */
@Data
@NoArgsConstructor
@Accessors(chain = true)
@TableName("tool_qiniu_content")
public class ToolQiniuContent extends Model<ToolQiniuContent> implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * ID
     */
    @TableId
	private Long contentId;
    /**
     * Bucket 识别符
     */
    private String bucket;
    /**
     * 文件名称
     */
    private String name;
    /**
     * 文件大小
     */
    private String size;
    /**
     * 文件类型：私有或公开
     */
    private String type;
    /**
     * 文件url
     */
    private String url;
    /**
     * 文件后缀
     */
    private String suffix;
    /**
     * 上传或同步的时间
     */
    @TableField(update = "now()")
	private Date updateTime;

}
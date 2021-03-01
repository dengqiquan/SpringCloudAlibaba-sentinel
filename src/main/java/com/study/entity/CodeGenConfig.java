package com.study.entity;

import java.io.Serializable;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * 代码生成器配置(code_gen_config)实体类
 *
 * @author dengqiquan
 * @since 2021-02-24 15:12:57
 * @description 由 Mybatisplus Code Generator 创建
 */
@Data
@NoArgsConstructor
@Accessors(chain = true)
@TableName("code_gen_config")
public class CodeGenConfig extends Model<CodeGenConfig> implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * ID
     */
    @TableId
	private Long configId;
    /**
     * 表名
     */
    private String tableName;
    /**
     * 作者
     */
    private String author;
    /**
     * 是否覆盖
     */
    private Integer cover;
    /**
     * 模块名称
     */
    private String moduleName;
    /**
     * 至于哪个包下
     */
    private String pack;
    /**
     * 前端代码生成的路径
     */
    private String path;
    /**
     * 前端Api文件路径
     */
    private String apiPath;
    /**
     * 表前缀
     */
    private String prefix;
    /**
     * 接口名称
     */
    private String apiAlias;

}
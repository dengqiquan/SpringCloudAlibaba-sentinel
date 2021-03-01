package com.study.entity;

import java.io.Serializable;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * 代码生成字段信息存储(code_column_config)实体类
 *
 * @author dengqiquan
 * @since 2021-02-24 15:12:57
 * @description 由 Mybatisplus Code Generator 创建
 */
@Data
@NoArgsConstructor
@Accessors(chain = true)
@TableName("code_column_config")
public class CodeColumnConfig extends Model<CodeColumnConfig> implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * ID
     */
    @TableId
	private Long columnId;
    /**
     * tableName
     */
    private String tableName;
    /**
     * columnName
     */
    private String columnName;
    /**
     * columnType
     */
    private String columnType;
    /**
     * dictName
     */
    private String dictName;
    /**
     * extra
     */
    private String extra;
    /**
     * formShow
     */
    private Integer formShow;
    /**
     * formType
     */
    private String formType;
    /**
     * keyType
     */
    private String keyType;
    /**
     * listShow
     */
    private Integer listShow;
    /**
     * notNull
     */
    private Integer notNull;
    /**
     * queryType
     */
    private String queryType;
    /**
     * remark
     */
    private String remark;
    /**
     * dateAnnotation
     */
    private String dateAnnotation;

}
package com.study.entity;

import java.io.Serializable;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * 支付宝配置类(tool_alipay_config)实体类
 *
 * @author dengqiquan
 * @since 2021-02-24 15:12:57
 * @description 由 Mybatisplus Code Generator 创建
 */
@Data
@NoArgsConstructor
@Accessors(chain = true)
@TableName("tool_alipay_config")
public class ToolAlipayConfig extends Model<ToolAlipayConfig> implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * ID
     */
    @TableId
	private Long configId;
    /**
     * 应用ID
     */
    private String appId;
    /**
     * 编码
     */
    private String charset;
    /**
     * 类型 固定格式json
     */
    private String format;
    /**
     * 网关地址
     */
    private String gatewayUrl;
    /**
     * 异步回调
     */
    private String notifyUrl;
    /**
     * 私钥
     */
    private String privateKey;
    /**
     * 公钥
     */
    private String publicKey;
    /**
     * 回调地址
     */
    private String returnUrl;
    /**
     * 签名方式
     */
    private String signType;
    /**
     * 商户号
     */
    private String sysServiceProviderId;

}
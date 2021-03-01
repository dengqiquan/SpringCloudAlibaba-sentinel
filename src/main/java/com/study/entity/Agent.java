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
 * 代理商信息(agent)实体类
 *
 * @author dengqiquan
 * @since 2021-02-24 15:12:57
 * @description 由 Mybatisplus Code Generator 创建
 */
@Data
@NoArgsConstructor
@Accessors(chain = true)
@TableName("agent")
public class Agent extends Model<Agent> implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId
	private Long id;
    /**
     * uap 用户id
     */
    private Integer userId;
    /**
     * 客户全称
     */
    private String company;
    /**
     * 联系人
     */
    private String name;
    /**
     * 联系电话
     */
    private String phone;
    /**
     * 职位
     */
    private String job;
    /**
     * 性别0：男1：女
     */
    private Integer sex;
    /**
     * 收款名称
     */
    private String beneficiarName;
    /**
     * 对公银行
     */
    private String corporateBank;
    /**
     * 对公银行卡号
     */
    private String corporateBankAccount;
    /**
     * 父代理id
     */
    private Integer pid;
    /**
     * 代理层级
     */
    private Integer level;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 更新时间
     */
    @TableField(update = "now()")
	private Date updateTime;
    /**
     * 账号
     */
    private String username;
    /**
     * 激活状态0未激活1以激活
     */
    private Integer activeStatus;
    /**
     * 激活时间
     */
    private Date activeTime;
    /**
     * 开户时间
     */
    private Date openTime;
    /**
     * 邮箱
     */
    private String email;
    /**
     * discount
     */
    private String discount;
    /**
     * 合作模式: 1 折扣差价返点，2 达量返点
     */
    private Integer cooperationModel;
    /**
     * 客户编码
     */
    private String customerCode;
    /**
     * 签约主体
     */
    private String contractBody;
    /**
     * 我方签约公司
     */
    private String ourContractedCompany;
    /**
     * 代理商折扣
     */
    private String agentDiscount;

}
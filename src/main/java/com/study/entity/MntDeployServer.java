package com.study.entity;

import java.io.Serializable;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * 应用与服务器关联(mnt_deploy_server)实体类
 *
 * @author dengqiquan
 * @since 2021-02-24 15:12:57
 * @description 由 Mybatisplus Code Generator 创建
 */
@Data
@NoArgsConstructor
@Accessors(chain = true)
@TableName("mnt_deploy_server")
public class MntDeployServer extends Model<MntDeployServer> implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 部署ID
     */
	private Long deployId;
    /**
     * 服务ID
     */
	private Long serverId;

}
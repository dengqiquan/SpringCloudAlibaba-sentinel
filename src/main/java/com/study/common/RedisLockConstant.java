package com.study.common;

/**
 * @description:
 * @author: Deng Qi Qua_n
 * @date: 2021/1/25 17:39
 */
public interface RedisLockConstant {
    /**
     * redis锁 超时时间参数 1分钟
     */
    Integer timeOut = 60000;
    /**
     * 广告主分配回收锁 key pre
     */
    String ADVERTISER_KEY = "lock:advertiserSubject";

    /**
     *代理商提现 key pre
     */
    String AGENT_KEY = "lock:agentSubject";

    /**
     *代理商开户 key pre
     */
    String AGENT_ACCOUNT_OPEN = "lock:agentAccountOpen";

}

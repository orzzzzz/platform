package com.icinfo.platform.common.constant;

import org.springframework.beans.factory.annotation.Value;

/**
 * 可配置常量
 */
public class ConfigConstant {
    /**
     * 微信公众号：appId
     */
    private String WECHAT_APP_ID;

    /**
     * 微信公众号：appSecret
     */
    private String WECHAT_APP_SECRET;

    /**
     * 微信公众号：token
     */
    private String WECHAT_TOKEN;

    @Value("${wechat.app.id}")
    public String getWECHAT_APP_ID() {
        return WECHAT_APP_ID;
    }

    @Value("${wechat.app.secret}")
    public String getWECHAT_APP_SECRET() {
        return WECHAT_APP_SECRET;
    }

    @Value("${wechat.token}")
    public String getWECHAT_TOKEN() {
        return WECHAT_TOKEN;
    }
}

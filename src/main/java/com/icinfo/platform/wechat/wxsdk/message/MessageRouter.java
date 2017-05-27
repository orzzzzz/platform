package com.icinfo.platform.wechat.wxsdk.message;

import java.util.Map;

/**
 * 消息路由
 */
public abstract class MessageRouter {
    /**
     * 获取消息转换器
     *
     * @param claszzKey 转换器标识
     * @return 转换器类名
     */
    protected abstract Class getResoler(String claszzKey);

    public String route(Map<String, String> message) throws Exception{
        // 获取msgType 和 event 组合作为路由标识
        String msgType = message.get("MsgType");
        String event = message.get("Event");


        return "";
    }
}

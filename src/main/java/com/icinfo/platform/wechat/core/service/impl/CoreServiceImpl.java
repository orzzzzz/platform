package com.icinfo.platform.wechat.core.service.impl;

import com.icinfo.platform.common.util.JSONUtils;
import com.icinfo.platform.wechat.core.service.ICoreService;
import com.icinfo.platform.wechat.wxsdk.message.MessageUtil;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * 微信service实现类
 */
@Service
public class CoreServiceImpl implements ICoreService {
    /**
     * 处理微信请求
     *
     * @param request 请求
     * @return 处理结果
     * @throws Exception
     */
    @Override
    public String processRequest(HttpServletRequest request) throws Exception {
        Map map = MessageUtil.parseXml(request);
        System.out.println(JSONUtils.parse(map));
        return null;
    }
}

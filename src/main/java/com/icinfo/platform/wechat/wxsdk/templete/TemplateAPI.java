package com.icinfo.platform.wechat.wxsdk.templete;


import com.icinfo.platform.common.client.HttpClientExecutor;
import com.icinfo.platform.common.client.JSONUtils;
import com.icinfo.platform.wechat.base.BaseResult;
import com.icinfo.platform.wechat.wxsdk.base.BaseAPI;
import com.icinfo.platform.wechat.wxsdk.templete.bean.Template;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.methods.RequestBuilder;
import org.apache.http.entity.StringEntity;

import java.nio.charset.Charset;

/**
 * TODO
 */
public class TemplateAPI extends BaseAPI {
    public static BaseResult send(String access_token, Template template) throws Exception {
        HttpUriRequest httpUriRequest = RequestBuilder.post()
                .setHeader(jsonHeader)
                .setUri(BASE_URI + "/cgi-bin/message/template/send")
                .addParameter(PARAM_ACCESS_TOKEN, access_token)
                .setEntity(new StringEntity(JSONUtils.toJSONString(template), Charset.forName("utf-8")))
                .build();
        return HttpClientExecutor.executeJsonResult(httpUriRequest, BaseResult.class);
    }
}

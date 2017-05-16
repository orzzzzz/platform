package com.icinfo.platform.wechat.wxsdk.menu;

import com.icinfo.platform.common.client.HttpClientExecutor;
import com.icinfo.platform.common.util.JSONUtils;
import com.icinfo.platform.wechat.base.BaseResult;
import com.icinfo.platform.wechat.wxsdk.base.BaseAPI;
import com.icinfo.platform.wechat.wxsdk.menu.bean.Menu;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.methods.RequestBuilder;
import org.apache.http.entity.StringEntity;

import java.nio.charset.Charset;

/**
 * 菜单 API
 */
public class MenuAPI extends BaseAPI {
    /**
     * 菜单创建
     *
     * @param access_token 接口调用凭证access_token
     * @param menu         菜单
     * @return 创建结果
     * @throws Exception
     */
    public static BaseResult createMenu(String access_token, Menu menu) throws Exception {
        HttpUriRequest request = RequestBuilder.post()
                .setHeader(jsonHeader)
                .setUri(BASE_URI + "/cgi-bin/menu/create")
                .addParameter("access_token", access_token)
                .setEntity(new StringEntity(JSONUtils.parse(menu), Charset.forName("utf-8")))
                .build();
        return HttpClientExecutor.executeJsonResult(request, BaseResult.class);
    }

    public static String getMenu(String access_token) throws Exception {
        HttpUriRequest request = RequestBuilder.get()
                .setUri(BASE_URI+"/cgi-bin/menu/get")
                .addParameter("access_token", access_token)
                .build();
        return HttpClientExecutor.executeJsonResult(request, String.class);
    }
}

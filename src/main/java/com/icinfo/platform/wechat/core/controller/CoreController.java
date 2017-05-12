package com.icinfo.platform.wechat.core.controller;

import com.icinfo.platform.wechat.wxsdk.controller.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * TODO
 */
@Controller
@RequestMapping("/core/")
public class CoreController extends BaseController {
    /**
     * 开发者接入
     *
     * @param request 请求
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "service", method = RequestMethod.GET)
    @ResponseBody
    public String validate(HttpServletRequest request) throws Exception {
        if (isWechatCall(request, "")){
            // 随机字符串
            String echostr = request.getParameter("echostr");
            return echostr;
        }
            return "error";
    }
}

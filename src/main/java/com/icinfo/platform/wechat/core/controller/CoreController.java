package com.icinfo.platform.wechat.core.controller;

import com.icinfo.platform.common.constant.ConfigConstant;
import com.icinfo.platform.wechat.wxsdk.controller.BaseController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * 微信核心控制类
 */
@Controller
@RequestMapping("/core")
public class CoreController extends BaseController {
    private static final Logger logger = LoggerFactory.getLogger(CoreController.class);

    /**
     * 开发者接入
     *
     * @param request 请求
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/service", method = RequestMethod.GET, produces = "text/plain")
    @ResponseBody
    public String validate(HttpServletRequest request) throws Exception {
        if (isWechatCall(request, ConfigConstant.WECHAT_TOKEN)){
            // 随机字符串
            String echostr = request.getParameter("echostr");
            logger.info("微信接入成功！");
            return echostr;
        }
            logger.error("微信接入失败！");
            return "error";
    }

    @RequestMapping(value = "/service", method = RequestMethod.POST)
    @ResponseBody
    public String processMsg(HttpServletRequest request)throws Exception{
        if(!isWechatCall(request, ConfigConstant.WECHAT_TOKEN)){
            return "";
        }

        return null;
    }
}

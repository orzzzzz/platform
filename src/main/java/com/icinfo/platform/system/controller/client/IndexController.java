package com.icinfo.platform.system.controller.client;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 首页控制器
 */
@Controller("clientIndexController")
public class IndexController {
    /**
     * 跳转到未登录首页
     *
     * @return
     */
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index() throws Exception {
        return "index";
    }

    /**
     * 跳转到登陆后首页
     *
     * @return
     */
    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String home() throws Exception {
        return "client/home";
    }
}

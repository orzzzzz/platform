package com.icinfo.platform.wechat.core.controller;

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
public class CoreController {
    @RequestMapping(value = "service", method = RequestMethod.GET)
    @ResponseBody
    public Boolean service(HttpServletRequest request) throws Exception{

        return true;
    }
}

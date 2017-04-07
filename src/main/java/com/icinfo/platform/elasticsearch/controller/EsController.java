package com.icinfo.platform.elasticsearch.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * TODO
 */
@Controller
@RequestMapping("/es/")
public class EsController {
    private static final Logger esLogger = LoggerFactory.getLogger("es-logger");

    public static void main(String[] args) {
        esLogger.info("12313");
    }
}

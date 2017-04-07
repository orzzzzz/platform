package com.icinfo.platform.huixin.service;

import java.io.File;

/**
 * 加班补贴服务接口
 */
public interface IPremiumService {
    void calculate(String flag, File file) throws Exception;
}

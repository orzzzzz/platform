package com.icinfo.platform.business.service;

import com.icinfo.platform.business.model.College;

import java.util.List;
import java.util.Map;

/**
 * 高校服务接口
 */
public interface ICollegeService {
    /**
     * 获取高校list
     *
     * @param list 查询条件
     * @return 高校list
     * @throws Exception
     */
    List<College> getList(List<String> list) throws Exception;

}

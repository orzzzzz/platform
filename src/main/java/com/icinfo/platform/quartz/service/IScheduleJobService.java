package com.icinfo.platform.quartz.service;


import com.icinfo.platform.quartz.vo.ScheduleJobVo;

import java.util.List;

/**
 * author : fengjing
 * createTime : 2016-08-04
 * description : 定时任务服务
 * version : 1.0
 */
public interface IScheduleJobService {

    /**
     * 初始化定时任务
     */
    void initScheduleJob();

    /**
     * 新增
     * 
     * @param scheduleJobVo
     * @return
     */
    Long insert(ScheduleJobVo scheduleJobVo);

    /**
     * 直接修改 只能修改运行的时间，参数、同异步等无法修改
     * 
     * @param scheduleJobVo
     */
    void update(ScheduleJobVo scheduleJobVo);

    /**
     * 删除重新创建方式
     * 
     * @param scheduleJobVo
     */
    void delUpdate(ScheduleJobVo scheduleJobVo);

    /**
     * 删除
     * 
     * @param scheduleJobId
     */
    void delete(Long scheduleJobId);

    /**
     * 运行一次任务
     *
     * @param scheduleJobId the schedule job id
     * @return
     */
    void runOnce(Long scheduleJobId);

    /**
     * 暂停任务
     *
     * @param scheduleJobId the schedule job id
     * @return
     */
    void pauseJob(Long scheduleJobId);

    /**
     * 恢复任务
     *
     * @param scheduleJobId the schedule job id
     * @return
     */
    void resumeJob(Long scheduleJobId);

    /**
     * 获取任务对象
     * 
     * @param scheduleJobId
     * @return
     */
    ScheduleJobVo get(Long scheduleJobId);

    /**
     * 查询任务列表
     * 
     * @param scheduleJobVo
     * @return
     */
    List<ScheduleJobVo> queryList(ScheduleJobVo scheduleJobVo);

    /**
     * 获取运行中的任务列表
     *
     * @return
     */
    List<ScheduleJobVo> queryExecutingJobList();

}

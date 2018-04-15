package com.service;

import javax.xml.transform.Result;
import java.util.List;

/**
 * Created by hrym13 on 2018/4/14.
 */
public interface MeditationRecordService {

    /**
     * 所有我加入的共修活动
     * @param userId
     * @return
     */
    List findMscheduleByUserId(Integer userId,Integer scheduleId);


    /**
     * 所有我未加入的共修活动
     * @param userId
     * @return
     */
    List findMschedule( Integer userId);

}

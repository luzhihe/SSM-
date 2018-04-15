package com.service.serviceImpl;

import com.dao.CountRecordMapper;
import com.dao.MscheduleMapper;
import com.model.CountRecord;
import com.model.MeditationSchedule;
import com.service.MeditationRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by hrym13 on 2018/4/14.
 */
@Service
public class MeditationRecordServiceImpl implements MeditationRecordService {

    @Autowired
    private MscheduleMapper mscheduleMapper;
    @Autowired
    private CountRecordMapper countRecordMapper;


    /**
     * 所有我加入的共修活动
     * @param userId
     * @return
     */
    public List findMscheduleByUserId(Integer userId,Integer scheduleId) {

       List<Map<String,Object>> list = new ArrayList();
        List<MeditationSchedule> schedules = mscheduleMapper.findMscheduleByUserId(userId);
        Map<String,Object> map = new HashMap();

       for (MeditationSchedule me :schedules){

           map.put("activeAuthor",me.getActiveAuthor());
           map.put("activeHeadUrl",me.getActiveHeadUrl());
           map.put("activeTitle",me.getActiveTitle());
           map.put("createdTime",me.getCreatedTime());
           map.put("expectTime",me.getExpectTime());
           map.put("groupStatus",me.getGroupStatus());
           map.put("realNumber",me.getRealNumber());
           map.put("scheduleId",me.getScheduleId());
           map.put("startTime",me.getStartTime());
           map.put("targetNumber",me.getTargetNumber());

       }
        Integer records = countRecordMapper.finAllCountByDay(userId,scheduleId);
        if (null !=records) {
            map.put("todayNumber", records);
        }else {
            map.put("todayNumber",0);
        }
        list.add(map);
        return  list;
    }

    /**
     * 未加入的共修活动列表
     * @param userId
     * @return
     */
    public List findMschedule(Integer userId) {

        List<MeditationSchedule> schedules = mscheduleMapper.findMschedule(userId);
        List<Map<String,Object>> list = new ArrayList<Map<String, Object>>();
        Map<String,Object> map = new HashMap<String, Object>();
        for ( MeditationSchedule sc: schedules){
            List<MeditationSchedule> scheduleList = mscheduleMapper.findUserCount(sc.getScheduleId());

            map.put("scheduleList",scheduleList);
        }
        map.put("schedules",schedules);
       list.add(map);
        return list;
    }



    public static void main(String[] args){
        int current = 30;
        int all = 70;
        NumberFormat nt = NumberFormat.getPercentInstance();
        //设置百分数精确度2即保留两位小数
        nt.setMinimumFractionDigits(0);
        float baifen = (float)current/all;
        System.out.println(nt.format(baifen));
    }
}

package com.controller;

import com.service.MeditationRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by hrym13 on 2018/4/15.
 */
@Controller
@RequestMapping("/home")
public class MeditationRecordController  {

    @Autowired
    private MeditationRecordService meditationRecordService;

    @RequestMapping("/findMscheduleByUserId")
    @ResponseBody
    public List findMscheduleByUserId( Integer userId,  Integer scheduleId){
        return meditationRecordService.findMscheduleByUserId(1,1);
    }
}

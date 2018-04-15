package com.dao;

import com.model.MeditationSchedule;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by hrym13 on 2018/4/14.
 */
@Repository
public interface MscheduleMapper {

    /**
     * 查找我加入的共修活动
     * @param userId
     * @return
     */
    @Select(" SELECT e.schedule_id,e.target_number,e.real_number,e.created_time,e.expect_time,e.active_title," +
            "e.active_head_url,e.group_status,e.start_time,e.active_author,d.user_id " +
            "FROM x_meditation_schedule e LEFT JOIN x_meditation_record d ON e.schedule_id=d.schedule_id WHERE user_id = #{userId}")
    List<MeditationSchedule> findMscheduleByUserId(Integer userId );

    /**
     * 查找我未加入的共修活动
     * @param userId
     * @return
     */
    @Select(" SELECT e.schedule_id,e.target_number,e.real_number,e.created_time,e.expect_time,e.active_title," +
            "e.active_head_url,e.group_status,e.start_time,e.active_author,d.user_id " +
            "FROM x_meditation_schedule e LEFT JOIN x_meditation_record d ON e.schedule_id=d.schedule_id WHERE user_id = #{userId}")
    List<MeditationSchedule> findMschedule(Integer userId );

    /**
     * 查找本活动共有多少人
     * @param scheduleId
     * @return
     */
    @Select("SELECT COUNT(1) as userNumber FROM x_meditation_record WHERE schedule_id =#{scheduleId}")
    List<MeditationSchedule> findUserCount(Integer scheduleId );
}

package com.dao;

import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * Created by hrym13 on 2018/4/14.
 */
@Repository
public interface MeditationRecordMapper {

    /**
     * 查找本活动有多少人参加
     * @param scheduleId
     * @return
     */
    @Select(" SELECT COUNT(1) FROM x_meditation_record WHERE schedule_id = #{scheduleId}")
    Integer selectUserCount( Integer scheduleId);
}

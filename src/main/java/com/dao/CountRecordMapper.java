package com.dao;

import com.model.CountRecord;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by hrym13 on 2018/4/14.
 */
@Repository
public interface CountRecordMapper {

    /**
     * 查找当天报数
     * @return
     */
    @Select(" SELECT SUM(count)as todayNumber  FROM x_count_record WHERE user_id = #{userId} and schedule_id=#{scheduleId} and created_time >=UNIX_TIMESTAMP( date_sub(curdate(),interval 0 day))")
   Integer finAllCountByDay(@Param("userId") Integer userId,@Param("scheduleId") Integer scheduleId);
}

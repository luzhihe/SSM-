package com.dao;

import com.model.User;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * Created by hrym13 on 2018/3/28.
 */
@Repository
public interface LoginMapper {

    /**
     * 登录接口
     * @param userName
     * @return
     */
    @Select("select user_name,user_id,password,created_time from user where user_name = #{userName}")
    User findByUserName(String userName);
}

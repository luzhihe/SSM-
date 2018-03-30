package com.service;


import com.model.User;

import java.util.List;

/**
 * Created by hrym13 on 2018/3/28.
 */

public interface PeopleService {


    List findAllpepple();

    /**
     * 登录
     * @param userName
     * @return
     */
    User findByUserName( String userName);
}

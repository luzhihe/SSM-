package com.service.serviceImpl;
import com.dao.LoginMapper;
import com.dao.PeopleMapper;
import com.model.People;
import com.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.service.PeopleService;

import java.util.List;


/**
 * Created by hrym13 on 2018/3/28.
 */
@Service
public class PeopleServiceImpl implements PeopleService {

    @Autowired
    private PeopleMapper peopleMapper;

    @Autowired
    private LoginMapper loginMapper;


    public List findAllpepple() {

        List<People> peopleList = peopleMapper.findAllPeople();

        return peopleList;
    }

    /**
     * 登录
     *
     * @param userName
     * @return
     */
    public User findByUserName(String userName) {

        if (userName == null) {
            return null;
        }else {
            User user = loginMapper.findByUserName(userName);
            if (user!=null) {
                return user;
            }else {
                return null;
            }
        }
    }


}


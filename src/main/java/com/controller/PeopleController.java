package com.controller;

import com.model.User;
import com.service.PeopleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;


/**
 * Created by hrym13 on 2018/3/27.
 */
@Controller
@RequestMapping("/home")
public class PeopleController {

    @Autowired
    private PeopleService peopleService;


    @RequestMapping("/findAllpepple")
    @ResponseBody
    public List findAllpepple(){

        return peopleService.findAllpepple();
    }

@RequestMapping("/login")
public String login(){
        return "login";
}

    @RequestMapping("/getLogin")
    public ModelAndView findByUserName(String userName){

        ModelAndView mav = new ModelAndView();
        User user = peopleService.findByUserName(userName);
//        System.out.println(user.getUserName());
        mav.addObject("user",user);
        mav.setViewName("/index");
        return mav;
    }

    @RequestMapping("/smallProgram")
    @ResponseBody
    public String smallProgram(){
        String dd = "weixin smallProgram";
        return dd;
    }
}

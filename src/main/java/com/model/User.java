package com.model;


import java.io.Serializable;

/**
 * Created by hrym13 on 2018/3/28.
 */
public class User implements Serializable {

    private Integer userId;
    private String userName;
    private String passWord;
    private Integer createdTime;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public Integer getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Integer createdTime) {
        this.createdTime = createdTime;
    }

    @Override
    public String toString() {
        return "user{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", passWord='" + passWord + '\'' +
                ", createdTime=" + createdTime +
                '}';
    }
}

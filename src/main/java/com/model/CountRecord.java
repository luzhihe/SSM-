package com.model;

import java.io.Serializable;

/**
 * 报数历史记录
 * Created by hrym13 on 2018/4/14.
 */
public class CountRecord implements Serializable {
    private Integer countId;            //主键ID
    private Integer scheduleId;        //活动ID
    private Integer createdTime;
    private Integer userId;
    private Integer count;
    private Integer todayNumber;        //今日报数

    public Integer getTodayNumber() {
        return todayNumber;
    }

    public void setTodayNumber(Integer todayNumber) {
        this.todayNumber = todayNumber;
    }

    public Integer getCountId() {
        return countId;
    }

    public void setCountId(Integer countId) {
        this.countId = countId;
    }

    public Integer getScheduleId() {
        return scheduleId;
    }

    public void setScheduleId(Integer scheduleId) {
        this.scheduleId = scheduleId;
    }

    public Integer getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Integer createdTime) {
        this.createdTime = createdTime;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "CountRecord{" +
                "countId=" + countId +
                ", scheduleId=" + scheduleId +
                ", createdTime=" + createdTime +
                ", userId=" + userId +
                ", count=" + count +
                ", todayNumber=" + todayNumber +
                '}';
    }
}

package com.model;

import java.io.Serializable;

/**
 * 参加共修活动记录表
 * Created by hrym13 on 2018/4/14.
 */
public class MeditationRecord implements Serializable {

    private Integer Id;
    private Integer scheduleId;         //共修活动ID
    private Integer status;             //共修群身份0:管理员；1:成员
    private Integer createdTime;
    private Integer userId;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public Integer getScheduleId() {
        return scheduleId;
    }

    public void setScheduleId(Integer scheduleId) {
        this.scheduleId = scheduleId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
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

    @Override
    public String toString() {
        return "MeditationRecord{" +
                "Id=" + Id +
                ", scheduleId=" + scheduleId +
                ", status=" + status +
                ", createdTime=" + createdTime +
                ", userId=" + userId +
                '}';
    }
}

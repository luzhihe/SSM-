package com.model;


import java.io.Serializable;

/**
 * 共修活动实体类
 * Created by hrym13 on 2018/4/14.
 */
public class MeditationSchedule implements Serializable {

    private Integer scheduleId;        //主键ID
    private Integer targetNumber;      //目标数
    private Integer realNumber;        //本活动已上报数
    private Integer createdTime;       //创建共修时间
    private Integer expectTime;       //预期完成目标结束时间
    private String activeTitle;        //共修内容名称
    private Integer groupStatus;       //共修活动身份
    private Integer startTime;         //共修开始时间
    private String activeAuthor;       //组建者
    private String activeHeadUrl;     //活动url
    private Integer userNumber;         //参加活动人数

    public Integer getUserNumber() {
        return userNumber;
    }

    public void setUserNumber(Integer userNumber) {
        this.userNumber = userNumber;
    }

    public Integer getScheduleId() {
        return scheduleId;
    }

    public void setScheduleId(Integer scheduleId) {
        this.scheduleId = scheduleId;
    }

    public Integer getTargetNumber() {
        return targetNumber;
    }

    public void setTargetNumber(Integer targetNumber) {
        this.targetNumber = targetNumber;
    }

    public Integer getRealNumber() {
        return realNumber;
    }

    public void setRealNumber(Integer realNumber) {
        this.realNumber = realNumber;
    }

    public Integer getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Integer createdTime) {
        this.createdTime = createdTime;
    }

    public Integer getExpectTime() {
        return expectTime;
    }

    public void setExpectTime(Integer expectTime) {
        this.expectTime = expectTime;
    }

    public String getActiveTitle() {
        return activeTitle;
    }

    public void setActiveTitle(String activeTitle) {
        this.activeTitle = activeTitle;
    }

    public Integer getGroupStatus() {
        return groupStatus;
    }

    public void setGroupStatus(Integer groupStatus) {
        this.groupStatus = groupStatus;
    }

    public Integer getStartTime() {
        return startTime;
    }

    public void setStartTime(Integer startTime) {
        this.startTime = startTime;
    }

    public String getActiveAuthor() {
        return activeAuthor;
    }

    public void setActiveAuthor(String activeAuthor) {
        this.activeAuthor = activeAuthor;
    }

    public String getActiveHeadUrl() {
        return activeHeadUrl;
    }

    public void setActiveHeadUrl(String activeHeadUrl) {
        this.activeHeadUrl = activeHeadUrl;
    }

    @Override
    public String toString() {
        return "MeditationSchedule{" +
                "scheduleId=" + scheduleId +
                ", targetNumber=" + targetNumber +
                ", realNumber=" + realNumber +
                ", createdTime=" + createdTime +
                ", expectTime=" + expectTime +
                ", activeTitle='" + activeTitle + '\'' +
                ", groupStatus=" + groupStatus +
                ", startTime=" + startTime +
                ", activeAuthor='" + activeAuthor + '\'' +
                ", activeHeadUrl='" + activeHeadUrl + '\'' +
                ", userNumber=" + userNumber +
                '}';
    }
}

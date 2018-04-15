package com.model;


import java.io.Serializable;

/**
 * 小程序用户
 * Created by hrym13 on 2018/4/14.
 */
public class WechatUsers implements Serializable {

    private Integer userId;
    private String wechatNumber;           //微信号
    private String wechatUuid;              //微信ID
    private String nickName;                //用户名
    private String createTime;
    private String phone;
    private String wechatHeadUrl;           //微信头像
    private Integer sex;                    //性别1:男；2女；
    private String address;                 //微信所在地区

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getWechatNumber() {
        return wechatNumber;
    }

    public void setWechatNumber(String wechatNumber) {
        this.wechatNumber = wechatNumber;
    }

    public String getWechatUuid() {
        return wechatUuid;
    }

    public void setWechatUuid(String wechatUuid) {
        this.wechatUuid = wechatUuid;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getWechatHeadUrl() {
        return wechatHeadUrl;
    }

    public void setWechatHeadUrl(String wechatHeadUrl) {
        this.wechatHeadUrl = wechatHeadUrl;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "WechatUsers{" +
                "userId=" + userId +
                ", wechatNumber='" + wechatNumber + '\'' +
                ", wechatUuid='" + wechatUuid + '\'' +
                ", nickName='" + nickName + '\'' +
                ", createTime='" + createTime + '\'' +
                ", phone='" + phone + '\'' +
                ", wechatHeadUrl='" + wechatHeadUrl + '\'' +
                ", sex=" + sex +
                ", address='" + address + '\'' +
                '}';
    }
}

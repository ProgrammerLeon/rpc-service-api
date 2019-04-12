package com.pgleon.rpcapi.user.pojo;

import java.io.Serializable;

/**
 * Created by Zev.Sun on 2018/3/2.
 */
public class TokenIdentity implements Serializable{
    public static final int EXIST = 0;
    public static final int DELETE_PASSWORDCHANGED = 1;
    public static final int DELETE_LOGINED = 2;

    private Integer userId;
    private String token;
    private String appId;
    private String deviceId;
    private String deviceName;
    private int deleteFlag;
    private String created;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public int getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(int deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    @Override
    public String toString() {
        return "TokenIdentity{" +
                "userId=" + userId +
                ", token='" + token + '\'' +
                ", appId='" + appId + '\'' +
                ", deviceId='" + deviceId + '\'' +
                ", deviceName='" + deviceName + '\'' +
                ", deleteFlag=" + deleteFlag +
                ", created='" + created + '\'' +
                '}';
    }
}
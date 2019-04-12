package com.pgleon.rpcapi.user.pojo;

import com.pgleon.rpcapi.user.enums.UserTypeEnum;

import java.io.Serializable;

public class UserType implements Serializable{
    private String userId;

    private UserTypeEnum userTypeEnum;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public UserTypeEnum getUserTypeEnum() {
        return userTypeEnum;
    }

    public void setUserTypeEnum(UserTypeEnum userTypeEnum) {
        this.userTypeEnum = userTypeEnum;
    }
}

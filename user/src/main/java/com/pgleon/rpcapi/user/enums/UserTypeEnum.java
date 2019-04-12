package com.pgleon.rpcapi.user.enums;

public enum  UserTypeEnum {
    NO_EBT_USER(-1, "非EBT用户"),
    EBT_AGENT_USER(1, "宜保通、展业家用户"),
    EBT_MARKET_USER(2, "网销门店用户"),
    EBT_INSIAP_USER(3, "管理台用户"),
    EBT_KEY_USER(4, "登录各系统的万能账户"),
    EBT_RISK_MARKET_USER(5, "创客门店账户"),
    EBT_CENTRAL_CONTROL_USER(6, "中控台账户");

    private int type;
    private String name;

    UserTypeEnum(int type, String name) {
        this.type = type;
        this.name = name;
    }


    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

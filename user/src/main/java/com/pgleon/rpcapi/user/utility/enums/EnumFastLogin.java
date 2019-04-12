package com.pgleon.rpcapi.user.utility.enums;

/**
 * Description 成功失败枚举类
 * Created by Zev.Sun on 2016/11/29.
 */
public enum EnumFastLogin {
    PhoneValidateCodeCheckFail(-1,"手机验证码验证失败"),
    CallWebSerciceFail(-2, "调用webservice失败");

    private final int code;
    private final String info;

    private EnumFastLogin(int code, String info) {
        this.code = code;
        this.info = info;
    }

    public String getInfo() {
        return info;
    }

    public int getCode() {
        return code;
    }
}
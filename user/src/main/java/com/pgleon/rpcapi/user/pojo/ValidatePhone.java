package com.pgleon.rpcapi.user.pojo;

import java.io.Serializable;

/**
 * Created by Zev.Sun on 2017/1/23.
 */
public class ValidatePhone implements Serializable {
    private String validateId;
    private String phone;
    private String validateCode;
    private Integer companyId;
    private Integer agentId;

    public String getValidateId() {
        return validateId;
    }

    public void setValidateId(String validateId) {
        this.validateId = validateId;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getValidateCode() {
        return validateCode;
    }

    public void setValidateCode(String validateCode) {
        this.validateCode = validateCode;
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public Integer getAgentId() {
        return agentId;
    }

    public void setAgentId(Integer agentId) {
        this.agentId = agentId;
    }

    @Override
    public String toString() {
        return "ValidatePhone{" +
                "validateId='" + validateId + '\'' +
                ", phone='" + phone + '\'' +
                ", validateCode='" + validateCode + '\'' +
                ", companyId=" + companyId +
                ", agentId=" + agentId +
                '}';
    }
}
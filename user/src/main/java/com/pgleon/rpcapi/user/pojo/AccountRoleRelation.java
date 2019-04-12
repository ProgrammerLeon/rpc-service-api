package com.pgleon.rpcapi.user.pojo;

import java.io.Serializable;
import java.util.List;


public class AccountRoleRelation implements Serializable{
    private Integer accountId;
    private List<Integer> roleIds;

    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    public List<Integer> getRoleIds() {
        return roleIds;
    }

    public void setRoleIds(List<Integer> roleIds) {
        this.roleIds = roleIds;
    }

    @Override
    public String toString() {
        return "AccountRoleRelation{" +
                "accountId=" + accountId +
                ", roleIds=" + roleIds +
                '}';
    }
}

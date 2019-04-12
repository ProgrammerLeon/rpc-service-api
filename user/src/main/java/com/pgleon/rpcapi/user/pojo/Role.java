package com.pgleon.rpcapi.user.pojo;

import java.io.Serializable;

/**
 * Created by Zev.Sun on 2017/1/4.
 */
public class Role implements Serializable{
    private Integer roleId;
    private String roleName;
    private Integer roleType;
    private Integer permissionId;
    private Integer companyId;
    private String description;
    private long createTime;

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(long createTime) {
        this.createTime = createTime;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public Integer getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(Integer permissionId) {
        this.permissionId = permissionId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getRoleType() {
        return roleType;
    }

    public void setRoleType(Integer roleType) {
        this.roleType = roleType;
    }

    @Override
    public String toString() {
        return "Role{" +
                "roleId=" + roleId +
                ", roleName='" + roleName + '\'' +
                ", roleType=" + roleType +
                ", permissionId=" + permissionId +
                ", companyId=" + companyId +
                ", description='" + description + '\'' +
                ", createTime=" + createTime +
                '}';
    }
}

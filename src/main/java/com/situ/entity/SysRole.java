package com.situ.entity;


public class SysRole {

  private long roleId;
  private String roleName;
  private String roleDesc;
  private long roleFlag;


  public long getRoleId() {
    return roleId;
  }

  public void setRoleId(long roleId) {
    this.roleId = roleId;
  }


  public String getRoleName() {
    return roleName;
  }

  public void setRoleName(String roleName) {
    this.roleName = roleName;
  }


  public String getRoleDesc() {
    return roleDesc;
  }

  public void setRoleDesc(String roleDesc) {
    this.roleDesc = roleDesc;
  }


  public long getRoleFlag() {
    return roleFlag;
  }

  public void setRoleFlag(long roleFlag) {
    this.roleFlag = roleFlag;
  }

}

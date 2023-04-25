package com.situ.entity;


public class SysUser {

  private long usrId;
  private String usrName;
  private String usrPassword;
  private long usrRoleId;
  private long usrFlag;


  public long getUsrId() {
    return usrId;
  }

  public void setUsrId(long usrId) {
    this.usrId = usrId;
  }


  public String getUsrName() {
    return usrName;
  }

  public void setUsrName(String usrName) {
    this.usrName = usrName;
  }


  public String getUsrPassword() {
    return usrPassword;
  }

  public void setUsrPassword(String usrPassword) {
    this.usrPassword = usrPassword;
  }


  public long getUsrRoleId() {
    return usrRoleId;
  }

  public void setUsrRoleId(long usrRoleId) {
    this.usrRoleId = usrRoleId;
  }


  public long getUsrFlag() {
    return usrFlag;
  }

  public void setUsrFlag(long usrFlag) {
    this.usrFlag = usrFlag;
  }

}

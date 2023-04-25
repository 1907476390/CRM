package com.crm.entity;


public class Orders {

  private long odrId;
  private String odrCustomer;
  private java.sql.Timestamp odrDate;
  private String odrAddr;
  private String odrStatus;


  public long getOdrId() {
    return odrId;
  }

  public void setOdrId(long odrId) {
    this.odrId = odrId;
  }


  public String getOdrCustomer() {
    return odrCustomer;
  }

  public void setOdrCustomer(String odrCustomer) {
    this.odrCustomer = odrCustomer;
  }


  public java.sql.Timestamp getOdrDate() {
    return odrDate;
  }

  public void setOdrDate(java.sql.Timestamp odrDate) {
    this.odrDate = odrDate;
  }


  public String getOdrAddr() {
    return odrAddr;
  }

  public void setOdrAddr(String odrAddr) {
    this.odrAddr = odrAddr;
  }


  public String getOdrStatus() {
    return odrStatus;
  }

  public void setOdrStatus(String odrStatus) {
    this.odrStatus = odrStatus;
  }

}

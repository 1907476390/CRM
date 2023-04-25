package com.crm.entity;


public class CstLost {

  private long lstId;
  private String lstCustNo;
  private String lstCustName;
  private long lstCustManagerId;
  private String lstCustManagerName;
  private java.sql.Timestamp lstLastOrderDate;
  private java.sql.Timestamp lstLostDate;
  private String lstDelay;
  private String lstReason;
  private String lstStatus;


  public long getLstId() {
    return lstId;
  }

  public void setLstId(long lstId) {
    this.lstId = lstId;
  }


  public String getLstCustNo() {
    return lstCustNo;
  }

  public void setLstCustNo(String lstCustNo) {
    this.lstCustNo = lstCustNo;
  }


  public String getLstCustName() {
    return lstCustName;
  }

  public void setLstCustName(String lstCustName) {
    this.lstCustName = lstCustName;
  }


  public long getLstCustManagerId() {
    return lstCustManagerId;
  }

  public void setLstCustManagerId(long lstCustManagerId) {
    this.lstCustManagerId = lstCustManagerId;
  }


  public String getLstCustManagerName() {
    return lstCustManagerName;
  }

  public void setLstCustManagerName(String lstCustManagerName) {
    this.lstCustManagerName = lstCustManagerName;
  }


  public java.sql.Timestamp getLstLastOrderDate() {
    return lstLastOrderDate;
  }

  public void setLstLastOrderDate(java.sql.Timestamp lstLastOrderDate) {
    this.lstLastOrderDate = lstLastOrderDate;
  }


  public java.sql.Timestamp getLstLostDate() {
    return lstLostDate;
  }

  public void setLstLostDate(java.sql.Timestamp lstLostDate) {
    this.lstLostDate = lstLostDate;
  }


  public String getLstDelay() {
    return lstDelay;
  }

  public void setLstDelay(String lstDelay) {
    this.lstDelay = lstDelay;
  }


  public String getLstReason() {
    return lstReason;
  }

  public void setLstReason(String lstReason) {
    this.lstReason = lstReason;
  }


  public String getLstStatus() {
    return lstStatus;
  }

  public void setLstStatus(String lstStatus) {
    this.lstStatus = lstStatus;
  }

}

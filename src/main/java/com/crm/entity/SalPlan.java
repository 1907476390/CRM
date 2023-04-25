package com.crm.entity;


public class SalPlan {

  private long plaId;
  private long plaChcId;
  private java.sql.Timestamp plaDate;
  private String plaTodo;
  private String plaResult;


  public long getPlaId() {
    return plaId;
  }

  public void setPlaId(long plaId) {
    this.plaId = plaId;
  }


  public long getPlaChcId() {
    return plaChcId;
  }

  public void setPlaChcId(long plaChcId) {
    this.plaChcId = plaChcId;
  }


  public java.sql.Timestamp getPlaDate() {
    return plaDate;
  }

  public void setPlaDate(java.sql.Timestamp plaDate) {
    this.plaDate = plaDate;
  }


  public String getPlaTodo() {
    return plaTodo;
  }

  public void setPlaTodo(String plaTodo) {
    this.plaTodo = plaTodo;
  }


  public String getPlaResult() {
    return plaResult;
  }

  public void setPlaResult(String plaResult) {
    this.plaResult = plaResult;
  }

}

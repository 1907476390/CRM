package com.crm.entity;


public class OrdersLine {

  private long oddId;
  private long oddOrderId;
  private long oddProdId;
  private long oddCount;
  private String oddUnit;
  private double oddPrice;


  public long getOddId() {
    return oddId;
  }

  public void setOddId(long oddId) {
    this.oddId = oddId;
  }


  public long getOddOrderId() {
    return oddOrderId;
  }

  public void setOddOrderId(long oddOrderId) {
    this.oddOrderId = oddOrderId;
  }


  public long getOddProdId() {
    return oddProdId;
  }

  public void setOddProdId(long oddProdId) {
    this.oddProdId = oddProdId;
  }


  public long getOddCount() {
    return oddCount;
  }

  public void setOddCount(long oddCount) {
    this.oddCount = oddCount;
  }


  public String getOddUnit() {
    return oddUnit;
  }

  public void setOddUnit(String oddUnit) {
    this.oddUnit = oddUnit;
  }


  public double getOddPrice() {
    return oddPrice;
  }

  public void setOddPrice(double oddPrice) {
    this.oddPrice = oddPrice;
  }

}

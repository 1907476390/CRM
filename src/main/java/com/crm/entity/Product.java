package com.crm.entity;


public class Product {

  private long prodId;
  private String prodName;
  private String prodType;
  private String prodBatch;
  private String prodUnit;
  private double prodPrice;
  private String prodMemo;


  public long getProdId() {
    return prodId;
  }

  public void setProdId(long prodId) {
    this.prodId = prodId;
  }


  public String getProdName() {
    return prodName;
  }

  public void setProdName(String prodName) {
    this.prodName = prodName;
  }


  public String getProdType() {
    return prodType;
  }

  public void setProdType(String prodType) {
    this.prodType = prodType;
  }


  public String getProdBatch() {
    return prodBatch;
  }

  public void setProdBatch(String prodBatch) {
    this.prodBatch = prodBatch;
  }


  public String getProdUnit() {
    return prodUnit;
  }

  public void setProdUnit(String prodUnit) {
    this.prodUnit = prodUnit;
  }


  public double getProdPrice() {
    return prodPrice;
  }

  public void setProdPrice(double prodPrice) {
    this.prodPrice = prodPrice;
  }


  public String getProdMemo() {
    return prodMemo;
  }

  public void setProdMemo(String prodMemo) {
    this.prodMemo = prodMemo;
  }

}

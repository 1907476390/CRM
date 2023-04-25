package com.crm.entity;


public class BasDict {

  private long dictId;
  private String dictType;
  private String dictItem;
  private String dictValue;
  private long dictIsEditable;


  public long getDictId() {
    return dictId;
  }

  public void setDictId(long dictId) {
    this.dictId = dictId;
  }


  public String getDictType() {
    return dictType;
  }

  public void setDictType(String dictType) {
    this.dictType = dictType;
  }


  public String getDictItem() {
    return dictItem;
  }

  public void setDictItem(String dictItem) {
    this.dictItem = dictItem;
  }


  public String getDictValue() {
    return dictValue;
  }

  public void setDictValue(String dictValue) {
    this.dictValue = dictValue;
  }


  public long getDictIsEditable() {
    return dictIsEditable;
  }

  public void setDictIsEditable(long dictIsEditable) {
    this.dictIsEditable = dictIsEditable;
  }

}

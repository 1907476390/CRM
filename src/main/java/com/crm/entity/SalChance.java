package com.crm.entity;


import lombok.Data;

@Data
public class SalChance {

  private Integer chcId;
  private String chcSource;
  private String chcCustName;
  private String chcTitle;
  private Integer chcRate;
  private String chcLinkman;
  private String chcTel;
  private String chcDesc;
  private Integer chcCreateId;
  private String chcCreateBy;
  private java.sql.Timestamp chcCreateDate;
  private Integer chcDueId;
  private String chcDueTo;
  private java.sql.Timestamp chcDueDate;
  private String chcStatus;



}

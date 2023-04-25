package com.crm.dao;

import com.crm.entity.SalChance;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

@Mapper
public interface SaleDAO {

    List<Map> query(SalChance salChance);
}

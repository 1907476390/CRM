package com.crm.dao;

import com.crm.entity.SalChance;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

@Mapper
public interface SaleDAO {

    /**
     * 高级查询销售机会
     * @param salChance
     * @return
     */
    List<Map> query(SalChance salChance);

    /**
     * 新增销售机会
     * @param salChance
     */
    @Insert("insert  into sal_chance values (default,#{chcSource}," +
            "#{chcCustName},#{chcTitle},#{chcRate},#{chcLinkman},#{chcTel}," +
            "#{chcDesc},#{chcCreateId},#{chcCreateBy},#{chcCreateDate}," +
            "#{chcDueTo},#{chcDueDate},#{chcStatus})")
    int addSale(SalChance salChance);
}

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
            "#{chcDesc},#{chcCreateId},#{chcCreateBy},#{chcCreateDate},null,null,null,1)")
    int addSale(SalChance salChance);


    /**
     * 查询客户经理
     */
    @Select("select user.usr_id id,user.usr_name name from sys_user user LEFT JOIN sys_role role on user.usr_flag = role.role_flag where role.role_id =4 ")
    List<Map> selManger();


    /**
     * @remark 根据id查询销售机会
     * @param id
     * @return
     */
    @Select("select * from sal_chance where chc_id = #{value}")
    SalChance selSaleById(Integer id);


}

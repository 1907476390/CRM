package com.crm.service;

import com.crm.entity.SalChance;

import java.util.List;
import java.util.Map;

public interface SaleService {

    List<Map> query(SalChance salChance);

    int addSale(SalChance salChance);

    List<Map> selManger();


    SalChance selSaleById(Integer id);
}

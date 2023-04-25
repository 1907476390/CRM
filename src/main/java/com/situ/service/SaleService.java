package com.situ.service;

import com.situ.entity.SalChance;

import java.util.List;
import java.util.Map;

public interface SaleService {

    List<Map> query(SalChance salChance);

    int addSale(SalChance salChance);

    List<Map> selManger();


    SalChance selSaleById(Integer id);

    int updateMeangers(SalChance salChance);

    int updateSale(SalChance salChance);
}

package com.crm.service;

import com.crm.entity.SalChance;

import java.util.List;
import java.util.Map;

public interface SaleService {

    List<Map> query(SalChance salChance);
}

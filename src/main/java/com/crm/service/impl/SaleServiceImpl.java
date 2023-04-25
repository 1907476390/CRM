package com.crm.service.impl;

import com.crm.dao.SaleDAO;
import com.crm.entity.SalChance;
import com.crm.service.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class SaleServiceImpl implements SaleService {
    @Autowired
    private SaleDAO saleDAO;

    /**
     * 高级查询 销售机会
     * @param salChance
     * @return
     */
    @Override
    public List<Map> query(SalChance salChance) {
        return saleDAO.query(salChance);
    }
}

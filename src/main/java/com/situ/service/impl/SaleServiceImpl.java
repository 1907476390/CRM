package com.situ.service.impl;

import com.situ.dao.SaleDAO;
import com.situ.entity.SalChance;
import com.situ.service.SaleService;
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

    /**
     * 新增销售机会
     * @param salChance
     * @return
     */
    @Override
    public int addSale(SalChance salChance) {

        return saleDAO.addSale(salChance);
    }

    /**
     * 查询客户经理
     * @return
     */
    @Override
    public List<Map> selManger() {
        return saleDAO.selManger();
    }

    @Override
    public SalChance selSaleById(Integer id) {
        return saleDAO.selSaleById(id);
    }

    /**
     * 设置指派人
     * @param salChance
     * @return
     */
    @Override
    public int updateMeangers(SalChance salChance) {
        return saleDAO.updateMeangers(salChance);
    }

    /**
     * 修改销售机会
     * @param salChance
     * @return
     */
    @Override
    public int updateSale(SalChance salChance) {
        return saleDAO.updateSale(salChance);
    }
}

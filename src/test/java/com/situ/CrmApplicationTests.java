package com.situ;

import com.situ.entity.SalChance;
import com.situ.service.SaleService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CrmApplicationTests {
 @Autowired
 private SaleService service;
    @Test
    void contextLoads() {

        SalChance salChance = service.selSaleById(7);
        System.out.println(salChance);
//        SalChance salChance = new SalChance();
//        salChance.setChcSource("");
//        salChance.setChcCustName("124");
//        salChance.setChcTitle("21");
//        salChance.setChcRate(80);
//        salChance.setChcLinkman("234");
//        salChance.setChcTel("2134");
//        salChance.setChcDesc("....");
//        salChance.setChcCreateId(1);
//        salChance.setChcCreateBy("小明");
//        salChance.setChcCreateDate(Timestamp.valueOf("2023-04-25 09:32:11"));
//        salChance.setChcDueId(0);
//        salChance.setChcDueTo("");
//        salChance.setChcDueDate(Timestamp.valueOf("2023-04-25 09:32:11"));
//        salChance.setChcStatus("1");
//        service.addSale(salChance);
    }

}

package com.crm.controller;

import com.crm.dto.Result;
import com.crm.entity.SalChance;
import com.crm.service.SaleService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class SaleController {
    @Autowired
    private SaleService service;


    @RequestMapping("/query")
    public Result query(SalChance salChance, @RequestParam(defaultValue = "1") int pageNum,
                        @RequestParam(defaultValue = "4") int pageSize) {
        PageHelper.startPage(pageNum, pageSize);

        List<Map> query = service.query(salChance);

        PageInfo pageInfo = new PageInfo(query, 4);

        Map map = new HashMap();

        map.put("query", query);

        map.put("pageInfo", pageInfo);

        return Result.ok(map);
    }

    @RequestMapping("/add")
    public Result add(SalChance salChance){
        int i = service.addSale(salChance);


        if(i > 0){
            return  Result.ok();
        }else{
            return Result.fail("新增失败");
        }
    }


    @RequestMapping("/manger")
    public Result selManger(){

        //查询客户经理
        List<Map> maps = service.selManger();

        maps.forEach(System.out::println);

        return Result.ok(maps);
    }

    @RequestMapping("/selSaleById")
    public Result selSaleById(Integer chcId){

        SalChance salChance = service.selSaleById(chcId);

        return  Result.ok(salChance);

    }

}

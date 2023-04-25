package com.situ.controller;

import com.situ.dto.Result;
import com.situ.entity.SalChance;
import com.situ.service.SaleService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    public Result add(SalChance salChance) {
        int i = service.addSale(salChance);


        if (i > 0) {
            return Result.ok();
        } else {
            return Result.fail("新增失败");
        }
    }


    @RequestMapping("/manger")
    public Result selManger() {

        //查询客户经理
        List<Map> maps = service.selManger();


        return Result.ok(maps);
    }

    @RequestMapping("/selSaleById/{id}")
    public Result selSaleById(@PathVariable Integer id) {

        SalChance salChance = service.selSaleById(id);

        return Result.ok(salChance);

    }

    @RequestMapping("/update")
    public Result update(SalChance salChance) {

        int i = service.updateMeangers(salChance);

        if (i > 0) {
            return Result.ok();
        } else {
            return Result.fail("保存失败");
        }
    }

    @RequestMapping("/updateSale")
    public Result updateSale(SalChance salChance){

        int i = service.updateSale(salChance);

        if (i > 0){
            return Result.ok();
        }else {
            return Result.fail("修改失败");
        }

    }


}

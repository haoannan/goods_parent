package com.czxy.web;

import com.czxy.pojo.Category;
import com.czxy.pojo.Goods;
import com.czxy.service.GoodsService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author haoannan 169650@qq.com
 * @date 2019/10/22
 * @infos
 */
@RestController
@RequestMapping("/good")
@CrossOrigin
public class GoodsController {

    @Resource
    private GoodsService goodsService;


    @PostMapping
    public ResponseEntity<String> addGood(@RequestBody Goods goods){
        System.out.println(goods);
        goodsService.addGood(goods);
        return ResponseEntity.ok("添加成功");
    }

    @GetMapping
    public ResponseEntity<List<Category>> allGoods(){
        List<Category> clist = goodsService.allGoods();
        System.out.println(clist);
        return ResponseEntity.ok(clist);
    }

}

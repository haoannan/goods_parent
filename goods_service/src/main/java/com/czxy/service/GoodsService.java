package com.czxy.service;

import com.czxy.pojo.Category;
import com.czxy.pojo.Goods;

import java.util.List;

/**
 * @author haoannan 169650@qq.com
 * @date 2019/10/22
 * @infos
 */
public interface GoodsService {
    List<Category> allGoods();

    void addGood(Goods goods);
}

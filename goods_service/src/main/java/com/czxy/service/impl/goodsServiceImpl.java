package com.czxy.service.impl;

import com.czxy.dao.CategoryDao;
import com.czxy.dao.GoodsDao;
import com.czxy.pojo.Category;
import com.czxy.pojo.Goods;
import com.czxy.service.GoodsService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author haoannan 169650@qq.com
 * @date 2019/10/22
 * @infos
 */
@Service
@Transactional
public class goodsServiceImpl implements GoodsService {

    @Resource
    private CategoryDao categoryDao;
    @Resource
    private GoodsDao goodsDao;

    @Override
    public List<Category> allGoods() {
        return categoryDao.selectAll();
    }

    @Override
    public void addGood(Goods goods) {
        goodsDao.insertSelective(goods);
    }
}

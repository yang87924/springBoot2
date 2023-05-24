package com.itheima.service.inpl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.itheima.dao.FoodDao;
import com.itheima.domain.Food;
import com.itheima.service.IFoodService;
import org.apache.logging.log4j.util.Strings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FoodServiceImpl extends ServiceImpl<FoodDao, Food>implements IFoodService {

    @Override
    public String aa() {
        return "hellow";
    }
    @Autowired
    private  FoodDao foodDao;
    @Override
    public boolean saveFood(Food book) {
        return foodDao.insert(book) > 0;
    }

    @Override
    public boolean  modify(Food book) {
        return foodDao.updateById(book) > 0;
    }

    @Override
    public boolean delete(Integer id) {
        return foodDao.deleteById(id) > 0;
    }

    @Override
    public IPage<Food> getPage(int currentPage, int pageSize) {
        IPage page = new Page(currentPage,pageSize);
        foodDao.selectPage(page,null);
        return page;
    }

    @Override
    public IPage<Food> getPage(int currentPage, int pageSize, Food food)
    {
        LambdaQueryWrapper<Food> lqw = new LambdaQueryWrapper<Food>();
        lqw.like(Strings.isNotEmpty(food.getName()),Food::getName,food.getName());
        lqw.like(Strings.isNotEmpty(food.getAddress()),Food::getAddress,food.getAddress());
        lqw.like(Strings.isNotEmpty(food.getTel()),Food::getTel,food.getTel());
        IPage page = new Page(currentPage,pageSize);
        foodDao.selectPage(page,lqw);
        return page;
    }
}

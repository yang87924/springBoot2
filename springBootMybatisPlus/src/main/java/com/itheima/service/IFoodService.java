package com.itheima.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.itheima.domain.Food;

public interface IFoodService extends IService<Food> {

    String aa();
    boolean saveFood(Food book);

    boolean modify(Food book);

    boolean delete(Integer id);
    IPage<Food> getPage(int currentPage, int pageSize);
    IPage<Food> getPage(int currentPage, int pageSize, Food food);

}


package com.itheima.ssmspringboot.service;



import com.baomidou.mybatisplus.core.metadata.IPage;
import com.itheima.ssmspringboot.domain.Food;

import java.util.List;

public interface FoodService {
    Boolean save(Food food);
    Boolean update(Food food);
    Boolean delete(Integer id);
    Food getById(Integer id);
    List<Food>getAll(Integer id);
    IPage<Food> getPage(int currentPage, int pageSize);
}

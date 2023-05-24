package com.itheima.dao;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.itheima.domain.Food;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class foodDaoTestCase {
    @Autowired
    private FoodDao foodDao;

    @Test
    void testGetById() {
        System.out.println(foodDao.selectById(1));
    }

    @Test
    void testSave() {
        Food food = new Food();
        food.setName("aa");
        food.setAddress("ss");
        food.setTel("09123456789");
        food.setPicURL("https://stickershop.line-scdn.net/stickershop/v1/product/1012965/LINEStorePC/main.png");
        food.setLatitude(24.153793214891476);
        food.setLongitude(120.68196814583169);
        foodDao.insert(food);
    }

    @Test
    void testUpdate() {
        Food food = new Food();
        food.setId(140);
        food.setName("bb");

        foodDao.updateById(food);
    }

    @Test
    void testDelete() {
        foodDao.deleteById(138);
    }

    @Test
    void testGetAll() {
        System.out.println(foodDao.selectList(null));

    }

    @Test
    void testGetPage() {
        IPage page = new Page(2,5);
        foodDao.selectPage(page, null);
        System.out.println(page.getCurrent());
        System.out.println(page.getSize());
        System.out.println(page.getTotal());
        System.out.println(page.getPages());
        System.out.println(page.getRecords());
    }

    @Test
    void testGetBy() {
        //select *from food where name like %spring%
        QueryWrapper<Food> qw = new QueryWrapper<>();
        qw.like("Name","走馬瀨休閒農場");
        foodDao.selectList(qw);
    }

    @Test
    void testGetBy2() {
        IPage page = new Page(2,5);
        String name = "走馬瀨休閒農場";
        LambdaQueryWrapper<Food> lqw = new LambdaQueryWrapper<Food>();
        //if(name != null) lqw.like(Book::getName,name);		//方式一：JAVA代码控制
        lqw.like(name != null,Food::getName,name.trim());				//方式二：API接口提供控制开关
        //foodDao.selectList(lqw);
        foodDao.selectPage(page,lqw);
    }

}











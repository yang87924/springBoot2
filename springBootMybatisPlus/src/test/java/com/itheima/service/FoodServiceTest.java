package com.itheima.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.itheima.domain.Food;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class FoodServiceTest {
    @Autowired
    private IFoodService foodService;
    //private IFoodService foodService;
    @Test
    void  testGetById(){
        System.out.println(foodService.getById(1));
    }
    @Test
    void testSave() {
        Food food = new Food();
        food.setName("1");
        food.setAddress("ss");
        food.setTel("09123456789");
        food.setPicURL("https://stickershop.line-scdn.net/stickershop/v1/product/1012965/LINEStorePC/main.png");
        food.setLatitude(24.153793214891476);
        food.setLongitude(120.68196814583169);
        foodService.save(food);
    }

    @Test
    void testUpdate() {
        Food food = new Food();
        food.setId(140);
        food.setAddress("123456");
        food.setTel("09123456789");
        food.setPicURL("https://stickershop.line-scdn.net/stickershop/v1/product/1012965/LINEStorePC/main.png");
        food.setLatitude(24.153793214891476);
        food.setLongitude(120.68196814583169);
        foodService.updateById(food);
    }

    @Test
    void testDelete() {
        foodService.removeById(139);
    }

    @Test
    void testGetAll() {
        System.out.println(foodService.list(null));

    }

    @Test
    void testGetPage() {
        IPage<Food>page=new Page<Food>(2,5);
        foodService.page(page);
        System.out.println(page.getCurrent());
        System.out.println(page.getSize());
        System.out.println(page.getTotal());
        System.out.println(page.getPages());
        System.out.println(page.getRecords());
    }

//    @Test
//    void testGetBy() {
//        //select *from food where name like %spring%
//        QueryWrapper<Food> qw = new QueryWrapper<>();
//        qw.like("Name","走馬瀨休閒農場");
//        foodService.g(qw);
//    }

//    @Test
//    void testGetBy2() {
//        IPage page = new Page(2,5);
//        String name = "走馬瀨休閒農場";
//        LambdaQueryWrapper<Food> lqw = new LambdaQueryWrapper<Food>();
//        //if(name != null) lqw.like(Book::getName,name);		//方式一：JAVA代码控制
//        lqw.like(name != null,Food::getName,name.trim());				//方式二：API接口提供控制开关
//        //foodDao.selectList(lqw);
//        foodService.selectPage(page,lqw);
//    }

}











package com.itheima.ssmspringboot;



import com.baomidou.mybatisplus.core.metadata.IPage;
import com.itheima.ssmspringboot.domain.Food;
import com.itheima.ssmspringboot.service.FoodService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class FoodServiceTestCase {
    @Autowired
    private FoodService foodService;
    //private IFoodService foodService;
    @Test
    void  testGetById(){
        System.out.println(foodService.getById(1));
    }
    @Test
    void testSave() {
        Food food = new Food();
        food.setName("aaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
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
        food.setId(139);
        food.setName("ssssss");
        food.setLatitude(24.153793214891476);
        food.setLongitude(120.68196814583169);
        foodService.update(food);
    }

    @Test
    void testDelete() {
        foodService.delete(137);
    }

    @Test
    void testGetAll() {
        System.out.println(foodService.getAll(null));

    }

    @Test
    void testGetPage() {
       // IPage page = new Page(2,5);
        IPage<Food> page = foodService.getPage(1, 5);
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











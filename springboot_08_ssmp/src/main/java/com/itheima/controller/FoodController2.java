package com.itheima.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.itheima.domain.Food;
import com.itheima.service.IFoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@RestController
@RequestMapping("/foods")
public class FoodController2 {
    @Autowired
    private IFoodService foodService;
//    @GetMapping
//    public String a(){
//        return foodService.aa();
//    }
    @GetMapping
    public List<Food>s(){
        return foodService.list();
    }



    @PostMapping
    public Boolean save(@RequestBody Food food){
        return foodService.save(food);
    }
    @PutMapping
    public Boolean update(@RequestBody Food book){
        return foodService.modify(book);
    }

    @DeleteMapping("{id}")
    public Boolean delete(@PathVariable Integer id){
        return foodService.delete(id);
    }

    @GetMapping("{id}")
    public Food getById(@PathVariable Integer id){
        return foodService.getById(id);
    }

    @GetMapping("{currentPage}/{pageSize}")
    public IPage<Food> getPage(@PathVariable int currentPage,@PathVariable int pageSize){
        return foodService.getPage(currentPage,pageSize);
    }

}

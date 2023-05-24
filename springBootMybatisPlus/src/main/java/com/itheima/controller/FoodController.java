package com.itheima.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.itheima.controller.utils.R;
import com.itheima.domain.Food;
import com.itheima.service.IFoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/foods")
public class FoodController {
    @Autowired
    private IFoodService foodService;
//    @GetMapping
//    public String a(){
//        return foodService.aa();
//    }
    @GetMapping
    public R getAll(){
        return  new R(true,foodService.list());
    }



    @PostMapping
    public R save(@RequestBody Food food){
        boolean flag =foodService.save(food);
        return new R(flag, flag ? "添加成功^_^" : "添加失败-_-!");

    }
    @PutMapping
    public R update(@RequestBody Food book){
        boolean flag =foodService.modify(book);
        return new R(flag, flag ? "修改成功^_^" : "修改失败-_-!");
        //return new R(foodService.modify(book));
    }

    @DeleteMapping("{id}")
    public R delete(@PathVariable Integer id){

        return new R(foodService.delete(id));
    }

    @GetMapping("{id}")
    public R getById(@PathVariable Integer id){
        return new R(true,foodService.getById(id));
    }



//    @GetMapping("{currentPage}/{pageSize}")
//    public R getPage(@PathVariable int currentPage,@PathVariable int pageSize){
//        IPage<Food> page = foodService.getPage(currentPage, pageSize);
//        //如果当前页码值大于了总页码值，那么重新执行查询操作，使用最大页码值作为当前页码值
//        if( currentPage > page.getPages()){
//            page = foodService.getPage((int)page.getPages(), pageSize);
//        }
//        return new R(true, page);
//    }

    @GetMapping("{currentPage}/{pageSize}")
    public R getPage(@PathVariable int currentPage, @PathVariable int pageSize, Food food){
//        System.out.println("参数==>"+book);

        IPage<Food> page = foodService.getPage(currentPage, pageSize,food);
        //如果当前页码值大于了总页码值，那么重新执行查询操作，使用最大页码值作为当前页码值
        if( currentPage > page.getPages()){
            page = foodService.getPage((int)page.getPages(), pageSize,food);
        }
        return new R(true, page);
    }

}

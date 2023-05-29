package com.itheima.ssmspringboot.service.inpl;



import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.itheima.ssmspringboot.dao.FoodDao;
import com.itheima.ssmspringboot.domain.Food;
import com.itheima.ssmspringboot.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoodServiceImpl2 implements FoodService {
    @Autowired
    private FoodDao foodDao;
    @Override
    public Boolean save(Food food) {

        return foodDao.insert(food)>0;
    }

    @Override
    public Boolean update(Food food) {
        return foodDao.updateById(food)>0;
    }

    @Override
    public Boolean delete(Integer id) {
        return foodDao.deleteById(id)>0;
    }

    @Override
    public Food getById(Integer id) {
        return foodDao.selectById(id);
    }

    @Override
    public List<Food> getAll(Integer id) {
        return foodDao.selectList(null);
    }

    @Override
    public IPage<Food> getPage(int currentPage, int pageSize) {
        IPage page=new Page(currentPage,pageSize);
        foodDao.selectPage(page,null);
        return page;
    }
}

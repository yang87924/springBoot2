package com.itheima.dao;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.itheima.domain.Food;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface FoodDao extends BaseMapper<Food> {
//    @Select("select * from food where id=#{id}")
//    Food aa(Integer id);
}

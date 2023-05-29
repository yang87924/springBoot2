package com.itheima;

import com.itheima.dao.CustDao;
import com.itheima.dao.FoodDao;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Springboot06MybatisPlusApplicationTests {
	@Autowired
	private CustDao custDao;

	@Autowired
	private FoodDao foodDao;
	@Test
	void contextLoads() {
		System.out.println(custDao.selectById(5));
	}
	@Test
	void testGetAll() {
		System.out.println(foodDao.selectList(null));
		//System.out.println(custDao.selectList(null));
	}

}

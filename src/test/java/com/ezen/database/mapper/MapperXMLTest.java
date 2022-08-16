package com.ezen.database.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.extern.log4j.Log4j2;

//0809 다른 방식의 mybatis
@Log4j2
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class MapperXMLTest {

	@Autowired
	EmployeeMapperXML mapper;
	
	@Autowired //어노테이션은 변수 하나당 하나씩 일일이 적어줘야 한다 
	PizzaMapperXMLtest pizzaMapper;
	
//	@Test
//	public void test() {
//		log.info(mapper.getList());
//	}
//	
//	@Test
//	public void test2() {
//		log.info(mapper.getListByDept(50));
//	}
	
	
//	@Test
//	public void pizzaTest1() {
//		
//		log.info(pizzaMapper.select());
//		//log.info(pizzaMapper.insertPizza(1, "supreme", 20000, 300));
//		
//	}
	
	// 0816 employeeXML 부등호 사용 테스트
	@Test
	public void test3() {
		log.info(mapper.getListBetweenDept(30, 80));
	}

}

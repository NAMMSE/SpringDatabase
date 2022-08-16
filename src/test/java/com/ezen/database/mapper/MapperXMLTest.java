package com.ezen.database.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.extern.log4j.Log4j2;

//0809 �ٸ� ����� mybatis
@Log4j2
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class MapperXMLTest {

	@Autowired
	EmployeeMapperXML mapper;
	
	@Autowired //������̼��� ���� �ϳ��� �ϳ��� ������ ������� �Ѵ� 
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
	
	// 0816 employeeXML �ε�ȣ ��� �׽�Ʈ
	@Test
	public void test3() {
		log.info(mapper.getListBetweenDept(30, 80));
	}

}

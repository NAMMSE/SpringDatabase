package com.ezen.database.mapper;

import java.util.List;

import org.apache.logging.log4j.message.Message;

import com.ezen.database.dto.Pizza;

public interface PizzaMapperXML {
	
	public List<Pizza> select();
	
	public void insertPizza(Integer id, String name, Integer price, Integer calrories);
	
	public void updatePizza(String name, Integer price, Integer calrories, Integer id);
	
	public void deletePizza(Integer id);
	
	//public void commit();
}

package com.ezen.database.mapper;

import java.util.List;

import org.apache.logging.log4j.message.Message;

import com.ezen.database.dto.Pizza;

public interface PizzaMapperXMLtest {
	
	public List<Pizza> select();
	
	public Message insertPizza(Integer id, String name, Integer price, Integer calrories);
	
	public void updatePizza(String name, Integer price, Integer calrories, Integer id);
	
	public void deletePizza(Integer id);
}

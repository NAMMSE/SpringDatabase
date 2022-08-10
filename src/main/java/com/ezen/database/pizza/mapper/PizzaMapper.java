package com.ezen.database.pizza.mapper;

import java.util.List;

import com.ezen.database.dto.Pizza;

//0810 °­»ç´Ô
public interface PizzaMapper {

	public List<Pizza> getAll();
	
	public int getIdByName(Pizza pizza);

	public int add(Pizza pizza);
	
	public Pizza getPizza(int id);

	public Integer update(Pizza pizza);
}

package com.ezen.database.pizza.service;

import java.util.List;

import com.ezen.database.dto.Pizza;

// 0810 강사님

public interface PizzaService {
	public List<Pizza> getPizzaList();

	public Integer addPizza(Pizza pizza);// pizza를 추가하고 해당 pizza의 id를 가져오는 메서드
	
	public Pizza updatePizzaForm(int id);
	
	public Integer updatePizza(Pizza pizza);

}

package com.ezen.database.pizza.service;

import java.util.List;

import com.ezen.database.dto.Pizza;

// 0810 �����

public interface PizzaService {
	public List<Pizza> getPizzaList();

	public Integer addPizza(Pizza pizza);// pizza�� �߰��ϰ� �ش� pizza�� id�� �������� �޼���
	
	public Pizza updatePizzaForm(int id);
	
	public Integer updatePizza(Pizza pizza);

}

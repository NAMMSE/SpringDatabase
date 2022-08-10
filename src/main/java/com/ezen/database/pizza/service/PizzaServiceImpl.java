package com.ezen.database.pizza.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ezen.database.dto.Pizza;
import com.ezen.database.pizza.mapper.PizzaMapper;

// 0810 �����
@Service // ���� ������� �������� �����ذ���
public class PizzaServiceImpl implements PizzaService {
	

	@Autowired
	PizzaMapper pizzaMapper;
	
//	@Autowired // ������̾ ������ �̿��ؼ� �̷������� �ᵵ �ȴ� 
//	public PizzaServiceImpl(PizzaMapper pizzaMapper) {
//		this.pizzaMapper = pizzaMapper;
//	}

	@Override
	public List<Pizza> getPizzaList() {
		return pizzaMapper.getAll();
	}

	@Override
	public Integer addPizza(Pizza pizza) { // ���ڸ� �߰��ϰ� �ش� ������ ���̵� �������� �޼���  /
		// �����̸��� unique�� �ɷ��ִٰ� ����
		
		// 1. ���ڸ� �߰��Ѵ�
		int row = pizzaMapper.add(pizza);
		
		// 2. ��� �߰��� ������ ���̵�� �𸣹Ƿ�(�������ϱ�) �̸��� ���� �ٽ� �����´�
		if(row>0) {
			return pizzaMapper.getIdByName(pizza);
		}else {
			return null;
		}
		
		// 3. ������ ���̵� ���� // �̷��� �ѹ��� �۾��� ���� ���Ӱ����� �޼��带 �� �� �ֱ� ������ ���� ������ �ʿ��ϴ�
		
	}

	@Override
	public Pizza updatePizzaForm(int id) {

		return pizzaMapper.getPizza(id);
	}

	@Override
	public Integer updatePizza(Pizza pizza) {
		// pizza �������� ���� �˻�..
		
		return pizzaMapper.update(pizza);
	}

	
	

}

package com.ezen.database.pizza.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ezen.database.dto.Pizza;
import com.ezen.database.pizza.mapper.PizzaMapper;

// 0810 강사님
@Service // 서비스 적어줘야 스프링이 수거해간다
public class PizzaServiceImpl implements PizzaService {
	

	@Autowired
	PizzaMapper pizzaMapper;
	
//	@Autowired // 오토와이어를 생성자 이용해서 이런식으로 써도 된다 
//	public PizzaServiceImpl(PizzaMapper pizzaMapper) {
//		this.pizzaMapper = pizzaMapper;
//	}

	@Override
	public List<Pizza> getPizzaList() {
		return pizzaMapper.getAll();
	}

	@Override
	public Integer addPizza(Pizza pizza) { // 피자를 추가하고 해당 피자의 아이디를 가져오는 메서드  /
		// 피자이름에 unique가 걸려있다고 가정
		
		// 1. 피자를 추가한다
		int row = pizzaMapper.add(pizza);
		
		// 2. 방금 추가한 피자의 아이디는 모르므로(시퀀스니까) 이름을 통해 다시 가져온다
		if(row>0) {
			return pizzaMapper.getIdByName(pizza);
		}else {
			return null;
		}
		
		// 3. 가져온 아이디를 리턴 // 이렇게 한번의 작업에 여러 영속계층의 메서드를 쓸 수 있기 때문에 서비스 계층이 필요하다
		
	}

	@Override
	public Pizza updatePizzaForm(int id) {

		return pizzaMapper.getPizza(id);
	}

	@Override
	public Integer updatePizza(Pizza pizza) {
		// pizza 수정값에 대한 검사..
		
		return pizzaMapper.update(pizza);
	}

	
	

}

package com.ezen.database.pizza.controller;
//0810

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ezen.database.dto.Pizza;
import com.ezen.database.pizza.service.PizzaService;

import lombok.extern.log4j.Log4j2;

@Log4j2
@RequestMapping(value="/pizza")//, method= {RequestMethod.GET, RequestMethod.POST})
@Controller
public class PizzaController {
	
//	@Autowired
//	PizzaMapperXML mapper;
	
	@Autowired
	PizzaService service;
	
//	@Autowired // 이런식으로 생성자 이용해서 오토와이어 쓸 수 있다
//	public PizzaController(PizzaService service) {
//		this.service = service;
//	}

	@GetMapping("/list")
	public void pizzaListPage(Model model) { // 접속했던 그대로 url을 찾아간다
		model.addAttribute("pizzas", service.getPizzaList());
	}
	
	@GetMapping("/add")
	public void pizzaAddForm() {
		
	}
	
	@PostMapping("/add")
	public String pizzaAddProcess(Pizza pizza) { // 컨트롤러에서 파라미터를 받을때는 pizza 그대로 받아도 된다
		log.info(pizza);
		Integer id = service.addPizza(pizza);
		log.info("ID : " + id);
		return "redirect:/pizza/list";
	}
	
	@GetMapping("/update")
	public String pizzaUpdateForm(Model model, Integer id) {
		log.info("To update id: " + id);
		if(id==null) {
			return "redirect:/pizza/list";
		}
		model.addAttribute("pizza", service.updatePizzaForm(id));
		
		return "pizza/update";
	}
	
	@PostMapping("/update")
	public String pizzaUpdateProcess(Pizza pizza) {
		service.updatePizza(pizza);
		return "redirect:/pizza/list";
	}
	
//	@GetMapping("/insert/")
//	public String insert() {
//		
//		mapper.insertPizza(2, "supreme", 20000, 100);
//		//mapper.commit();
//		
//		
//		return "views/pizza/form";
//	}
}

package com.ezen.database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ezen.database.dto.Employee;
import com.ezen.database.mapper.EmployeeMapper;

import lombok.extern.log4j.Log4j2;

// 0809

@Log4j2
@RequestMapping(value="/employee", method = {RequestMethod.GET, RequestMethod.POST})
@Controller
public class EmployeeController {
	
	@Autowired
	DataSource ds; // 소스코드의 분리가 필요하다
	
	@Autowired
	EmployeeMapper mapper;
	
	// 사원 목록을 모두 조회해야하는 여러가지 서비스
	// - 사원 해고 페이지
	// - 사원 월급 조정 페이지
	
	@GetMapping("/fire")
	public void fire(Model model) {
		for (Employee emp : mapper.getList()) {
			log.info(emp.getFirst_name() + " " + emp.getLast_name());
		}
	}
	
	@GetMapping("/list")
	public void list(Model model) {
		
//		List<Employee> employees = new ArrayList<>();
//		
//		try(
//				Connection conn = ds.getConnection();
//				PreparedStatement pstmt = conn.prepareStatement("select * from employees");
//				ResultSet rs = pstmt.executeQuery();
//			) {
//			
//			while(rs.next()) {
//				employees.add(new Employee(rs));
//			}
//			
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
		
//		model.addAttribute("employees",employees);
		model.addAttribute("employees",mapper.getList()); // mybatis 쓰면 이렇게만 해도 된다
	}

}

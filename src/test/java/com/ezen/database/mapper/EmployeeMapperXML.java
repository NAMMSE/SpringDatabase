package com.ezen.database.mapper;

import java.util.List;

import com.ezen.database.dto.Employee;

public interface EmployeeMapperXML {
	public List<Employee> getList();
	
	public List<Employee> getListByDept(int department_id);

}

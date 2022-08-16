package com.ezen.database.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ezen.database.dto.Employee;

public interface EmployeeMapperXML {
	public List<Employee> getList();
	
	public List<Employee> getListByDept(int department_id);
	
	public List<Employee> getListBetweenDept(
			@Param("lower_dept") int lower_dept, @Param("upper_dept") int upper_dept);
}

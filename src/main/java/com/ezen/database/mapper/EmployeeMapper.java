package com.ezen.database.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.ezen.database.dto.Employee;

//0809
public interface EmployeeMapper {
	
	/*
	 * 	private Integer employee_id;
	private String first_name;
	private String last_name;
	private Double commission_pct;
	private Double salary;
	private String job_id;
	private Integer department_id;
	 * */
	
	@Select("select * from employees")//"select employee_id, first_name, last_name, job_id, salary, commission_pct, department_id from employees")
	public List<Employee> getList();
	
	@Select("select * from employees where employee_id = #{id}")//"select employee_id, first_name, last_name, job_id, salary, commission_pct, department_id from employees")
	public Employee findById(@Param("id") long id);
	
	@Select("select * from user where first_name = #{name}")
	public Employee findByName(@Param("name") String name);
	
	@Select("select * from user where first_email = #{email}")
	public Employee findByEmail(@Param("email") String email);
	
	
}

package com.ezen.database.dto;

import java.sql.ResultSet;
import java.sql.SQLException;

import lombok.Data;

//0809 

@Data
public class Employee {

	private Integer employee_id;
	private String first_name;
	private String last_name;
	private Double commission_pct;
	private Double salary;
	private String job_id;
	private Integer department_id;
	
	public Employee(ResultSet rs) throws SQLException {
		employee_id = rs.getInt("employee_id");
		first_name = rs.getString("first_name");
		last_name = rs.getString("last_name");
		salary = rs.getDouble("salary");
		commission_pct = rs.getDouble("commission_pct");
		job_id = rs.getString("job_id");
		department_id = rs.getInt("department_id");
	}
}

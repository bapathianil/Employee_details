package com.employeedemo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


@Repository
public class EmployeeJdbcRepository {

	@Autowired
    JdbcTemplate jdbcTemplate;
	
	public Employee findById(int empid) {
	    return jdbcTemplate.queryForObject("select * from employee_details where emp_id=?", new Object[]{empid},
	        new BeanPropertyRowMapper < Employee > (Employee.class));
	}
	
	public List < Employee > findAll() {
	    return jdbcTemplate.query("select * from employee_details", new EmployeeRowMapper());
	}
	
	public int deleteById(int id) {
			return jdbcTemplate.update("delete from employee_details where emp_id=?", new Object[] {id});
	}
	
	public int insert(Employee employee) {
		return jdbcTemplate.update("insert into employee_details ( emp_id,emp_name,emp_organisation) " + "values(?,?,?)",
				new Object[] {
						employee.getEmpId(),employee.getEmpName(),employee.getEmpOrganisation()
        });
	}
	
	public int update(Employee employee) {
		return jdbcTemplate.update("update employee_details " + "set emp_name=?, emp_organisation = ? "+ " where emp_id = ?",
				new Object[] {
						employee.getEmpName(), employee.getEmpOrganisation(), employee.getEmpId()
        });
	}

}



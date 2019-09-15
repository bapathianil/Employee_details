package com.employeedemo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

	@Autowired
    EmployeeJdbcRepository repository;
	
	@PostMapping(path="/employeeinfo")
	public Employee getEmployeeById( int id) {
		Employee tr = new Employee();
		tr=repository.findById(id);
		System.out.println("Employee is :"+tr.getEmpId());
		return tr;
	}
	
	@GetMapping(path="/employeesinfo")
	public List<Employee> getEmployees() {
		List<Employee> list = new ArrayList<Employee>();
		list=repository.findAll();
		System.out.println("Employees are :"+list);
		return list;
	}
	
	@PostMapping(path="/Employeedeleteinfo")
	public int deleteEmployees(int id) {
		int deletedId=repository.deleteById(id);
		System.out.println("Deleted Employee is :"+deletedId);
		return deletedId;
	}
	
	@PostMapping(path="/Employeeupdateinfo")
	public int updateEmployees(Employee employee) {
		int updatedId=repository.update(employee);
		System.out.println("Updated Employee is :"+updatedId);
		return updatedId;
	}
	
	@PostMapping(path="/Employeeinsertinfo")
	public int insertStudents(Employee employee) {
		int insertedId=repository.insert(employee);
		System.out.println("Inserted Student is :"+insertedId);
		return insertedId;
	}

}



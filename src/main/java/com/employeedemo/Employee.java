package com.employeedemo;

public class Employee {

	private int empId;
	
	private String empName;
	
	private String  empOrganisation;

	public Employee(int empId, String empName, String empOrganisation) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empOrganisation = empOrganisation;
	}

	public Employee() {
		super();
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpOrganisation() {
		return empOrganisation;
	}

	public void setEmpOrganisation(String empOrganisation) {
		this.empOrganisation = empOrganisation;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empId + ", empName=" + empName + ", empOrganisation=" + empOrganisation + "]";
	}
	
	
}

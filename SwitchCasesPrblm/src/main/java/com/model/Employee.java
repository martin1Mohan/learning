package com.model;

public class Employee {
	
	private int empId;
	private String empName;
	private float salary;
	
	public Employee() {
		this.empId=00;
		this.empName="None";
		this.salary=00;
	}
	public Employee(int id,String name,float salary) {
		this.empId=id;
		this.empName=name;
		this.salary=salary;
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
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}

}

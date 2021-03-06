package com.main;

import java.util.ArrayList;
import java.util.List;

import com.model.Employee;

public class ForEachDemo {

	public static void main(String[] args) {

		List<Employee> employees = new ArrayList<Employee>();

		employees.add(new Employee(10, "Mohan Murali Rao", 30000f));
		employees.add(new Employee(121, "Gopi", 29500f));
		employees.add(new Employee(101, "Mohan", 300f));
		
		employees.forEach((emp) -> {
			System.out.println("Employee Name : "+ emp.getEmpName());
			System.out.println("Employee Name : "+ emp.getEmpId());
			System.out.println("Employee Name : "+ emp.getSalary());
			System.out.println("-----------------------------------");
		});
	}

}

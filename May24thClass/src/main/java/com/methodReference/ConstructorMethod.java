package com.methodReference;

import com.model.Employee;
import com.service.InterfaceConstructor;

public class ConstructorMethod {
	
	public Employee setValues(int a, String b, float c) {
		Employee employee= new Employee(a, b, c);
		return employee;
	}

	public static void main(String[] args) {

		InterfaceConstructor constructor= Employee::new;
		
		Employee employee= constructor.create(1, "Mohan", 10000);
		
		
		System.out.println(employee.getEmpName());
	}

}

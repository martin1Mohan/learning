package com.main;

import com.model.Employee;
import com.model.FunctionalInterfaceWithObject;

public class FIMain1 {

	public static void main(String[] args) {

		FunctionalInterfaceWithObject withObject = (emp) -> emp.getEmpName();

		Employee employee = new Employee(1, "Mohan", 1000.0f);

		System.out.println(withObject.getName(employee));
	}

}

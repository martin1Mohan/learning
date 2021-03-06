package com.main;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;

import com.model.Employee;

public class PredefinedInterface {

	public static void main(String[] args) {

		BiConsumer<String, Integer> biConsumer= (str, intVar) -> {
			System.out.println("String Value : "+ str);
			System.out.println("Integer Value : "+ intVar);
		};
		
		biConsumer.accept("Mohan Murali Rao", 25);
		
		List<Employee> employees= new ArrayList<Employee>();
		
		employees.add(new Employee(10, "Mohan Murali Rao", 30000f));
		employees.add(new Employee(121, "Gopi", 29500f));
		employees.add(new Employee(101, "Mohan", 300f));
		
		BiFunction<List<Employee>, String, Employee> biFunction= (employeeList, nameToSearch) ->{
			
			Employee empTemp = null;
			for (Employee employee : employees) {
				if (employee.getEmpName().equals(nameToSearch)) {
					System.out.println("Employee Found!");
					empTemp= employee;
				}
			}
			
			return empTemp;
		};
		Employee searchEmp= biFunction.apply(employees, "Mohan Murali Rao");
		
		if (searchEmp != null) {
			System.out.println("Employee Name : "+ searchEmp.getEmpName());
			System.out.println("Employee Name : "+ searchEmp.getEmpId());
			System.out.println("Employee Name : "+ searchEmp.getSalary());
		} else {
			System.out.println("Employee Not Found!!!");
		}
	}

}

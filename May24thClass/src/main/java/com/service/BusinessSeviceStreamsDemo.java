package com.service;

import java.util.List;

import com.model.Employee;

public class BusinessSeviceStreamsDemo {

	public long countEmployee(List<Employee> list, String searchParams){
		long count= 0;
		for (Employee employee : list) {
			if (employee.getEmpName().startsWith(searchParams)) {
				count+=1;
			}
		}
		return count;
	}
}

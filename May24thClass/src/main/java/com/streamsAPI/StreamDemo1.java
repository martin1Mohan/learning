package com.streamsAPI;

import java.util.ArrayList;
import java.util.List;

import com.model.Employee;
import com.service.BusinessSeviceStreamsDemo;

public class StreamDemo1 {

	public static void main(String[] args) {

		Employee employee = new Employee(1, "Mohan", 12345);
		Employee employee2 = new Employee(2, "Sai", 45667);
		Employee employee3 = new Employee(3, "Sudheer", 78999);
		Employee employee4 = new Employee(4, "Mouli", 78999);
		Employee employee5 = new Employee(5, "Suman", 78999);

		List<Employee> list = new ArrayList<Employee>();

		list.add(employee);
		list.add(employee2);
		list.add(employee3);
		list.add(employee4);
		list.add(employee5);

		long var = list.stream().filter((a) -> a.getEmpName().startsWith("S")).count();

		System.out.println(var);

		list.stream().filter((a) -> a.getEmpName().startsWith("S")).forEach(System.out::println);// printing directly

		System.out.println("--------------------------------------------------------------------");
		list.stream().filter((a) -> a.getEmpName().startsWith("S")).filter((b) -> b.getSalary() > 50000)
				.forEach(System.out::println);// 2conditions

		BusinessSeviceStreamsDemo seviceStreamsDemo = new BusinessSeviceStreamsDemo();
		String searchParams = "M";
		long l = seviceStreamsDemo.countEmployee(list, searchParams);

		if (l > 0) {
			System.out.println(l + " Name found whose names starts with " + searchParams);
		} else {
			System.out.println("Sorry, No match found");
		}

	}

}

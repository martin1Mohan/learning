package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.model.Employee;

public class Demo1 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		ApplicationContext context= new ClassPathXmlApplicationContext("com/config/propertyplaceholderconfig.xml");
		
		Employee employee= (Employee) context.getBean("employee2");
		
		System.out.println(employee.getEmpName());
	}

}

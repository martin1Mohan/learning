package com.main;

import java.util.ArrayList;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import java.util.Iterator;
import java.util.List;


import com.model.Address;
import com.model.Employee;

public class ListOperation {
	
	private static final Logger LOGGER = LogManager.getLogger(ListOperation.class);

	public static void main(String[] args) {

		Address address = new Address(1, "Perungudi", "Chennai");
		Address address2 = new Address(2, "Perungudi1", "Chennai");
		Address address3 = new Address(3, "Perungudi2", "Chennai");
		
		Employee employee = new Employee(1, "Mohan", 12345, "Software", address);
		Employee employee2 = new Employee(2, "Murali", 45667, "Software", address2);
		Employee employee3 = new Employee(3, "Rao", 78999, "Software", address3);

		List<Object> list = new ArrayList<Object>();

		list.add(employee);
		list.add(employee2);
		list.add(employee3);

		System.out.println(list.size());

		for (Iterator<Object> iterator = list.iterator(); iterator.hasNext();) {
			Object object = (Object) iterator.next();
			
			if (object instanceof Employee) {
				Employee object1 = (Employee) object;
				System.out.println(object1.getEmpName());
				System.out.println(object1.getSalary());
				System.out.println(object1.getAddress().getStreet());
			};
//			if (object instanceof Address) {
//				Address object1 = (Address) object;
//				System.out.println(object1.getDoorNo());
//				System.out.println(object1.getCity());
//			};
			LOGGER.info(list+ "Successsful");

		}

	}

}

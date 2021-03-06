package com.main;

import com.model.DepartmentConstruct;
import com.model.EmployeeConstrct;
import com.service.EmployeCheck;

public class HrAppConstruct {
	public static void main(String[] args) {
		EmployeeConstrct[] employees= new EmployeeConstrct[2];
		
		EmployeeConstrct employee1 = new EmployeeConstrct(10, "Mohan Murali Rao", 30000f, "8886077232");

		EmployeeConstrct employee2 = new EmployeeConstrct(121,"Gopi",29500f,"7013872747");
		
		employees[0]= employee1;
		employees[1]= employee2;
		
		DepartmentConstruct department = new DepartmentConstruct(1, "Development", employees);

		EmployeeConstrct[] returnEmployess= department.getEmployees();
		for (int i = 0; i < returnEmployess.length; i++) {
			System.out.println(returnEmployess[i].getEmpName());
		}
		
		EmployeCheck check= new EmployeCheck();
		String status= check.checkEmployeeName(department, "Mohan Murali Rao");
		
		System.out.println(status);
		
		employee1= null;
		employee2= null;
		department= null;
		
	}
}

package com.main;

import com.model.DepartmentArray;
import com.model.Employee;

public class HrAppArray {

	public static void main(String[] args) {
		Employee[] employees= new Employee[2];
		
		Employee employee1 = new Employee();
		
		employee1.setEmpId(10);
		employee1.setEmpName("Mohan Murali Rao");
		employee1.setEmpSalary(30000f);
		employee1.setEmpContact("8886077232");

		Employee employee2 = new Employee();
		
		employee2.setEmpId(121);
		employee2.setEmpName("Gopi");
		employee2.setEmpSalary(29500f);
		employee2.setEmpContact("7013872747");
		
		employees[0]=employee1;
		employees[1]=employee2;
		
		DepartmentArray department = new DepartmentArray();
		
		department.setDeptId(1);
		department.setDeptName("Development");
		department.setEmployees(employees);

		Employee[] returnEmployess= department.getEmployees();
		for (int i = 0; i < returnEmployess.length; i++) {
			System.out.println(returnEmployess[i].getEmpName());
		}
		
		employee1= null;
		employee2= null;
		department= null;
		
	}

}

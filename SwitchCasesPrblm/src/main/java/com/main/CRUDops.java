package com.main;

import java.util.Scanner;
import com.service.*;

import com.model.Employee;

public class CRUDops {

	public static void main(String[] args) {

		Employee[] employees = {};
		// System.out.println("1- Add, 2- Update, 3- Read, 4- Delete, 5- END");
		// System.out.println("Please enter num as per your operation : ");
		Scanner scan = new Scanner(System.in);
		System.out.println("1- Add, 2- Update, 3- Read, 4- Delete, 5- END");
		System.out.println("Please enter num as per your operation : ");
		while (scan.hasNextInt()) {
			int a = scan.nextInt();
			if (a < 1 || a > 4) {
				break;
			} else {
				switch (a) {
				case 1:
					System.out.println("Total employees" + employees.length);
					System.out.println("New employee is being created.....Please follow the instructions");
					Employee employee = new Employee();
					System.out.println("Please enter the Employee Id");
					employee.setEmpId(scan.nextInt());
					System.out.println("Please enter the Employee Name");
					scan.nextLine();
					employee.setEmpName(scan.nextLine());
					System.out.println("Please enter the Salary of employee");
					employee.setSalary(scan.nextFloat());
					System.out.println("The new employee has been added");
					employees = CreateOps.addEmployee(employees, employee);
					System.out.println("Total employees" + employees.length);
					break;
				case 2:
					
					int count = employees.length;
					if (count == 0) {
						System.err.println("No data to update from the employee DB");
						System.out.println("1- Add, 2- Update, 3- Read, 4- Delete, 5- END");
						System.out.println("Please enter num as per your operation : ");
					} else {
						System.out.println("Employee is being edited.....Please follow the instructions");
						System.out.println("Enter Id of employee that You Want to Change");
						int id = scan.nextInt();
						for (int i = 0; i < count; i++) {
							if (employees[i].getEmpId() == id) {
								employees = UpdateOps.updateEmployee(employees, id);
							} else {
								System.err.println("Employee id NA. Please Check...");
								
							}
						}
						System.out.println("1- Add, 2- Update, 3- Read, 4- Delete, 5- END");
						System.out.println("Please enter num as per your operation : ");
					}

					break;
				case 3:
					if (employees.length == 0) {
						System.err.println("No data to display from the employee DB");
						System.out.println("1- Add, 2- Update, 3- Read, 4- Delete, 5- END");
						System.out.println("Please enter num as per your operation : ");
						break;
					} else {
						ReadOps.readAllEmployees(employees);
						System.out.println("----------------------------------------------------------");
						System.out.println("1- Add, 2- Update, 3- Read, 4- Delete, 5- END");
						System.out.println("Please enter num as per your operation : ");
						break;
					}
				case 4:
					if (employees.length == 0) {
						System.err.println("No data to remove/delete from the employee DB");
						System.out.println("1- Add, 2- Update, 3- Read, 4- Delete, 5- END");
						System.out.println("Please enter num as per your operation : ");
						break;
					} else {
						System.out.println("Enter Id of employee you want to remove");
						int id1 = scan.nextInt();
						employees = DeleteOps.removeEmployee(employees, id1);
						System.out.println("Employee removed successfully");
						break;
					}
				default:
					continue;
				}

			}
		}
		System.err.println("Terminated");
		scan.close();
	}
}
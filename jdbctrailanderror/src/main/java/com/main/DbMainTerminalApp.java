package com.main;

import java.util.Scanner;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import com.model.User;
import com.service.DbWorks;
import com.service.DbWorksImpl;

public class DbMainTerminalApp {
	
	private static final Logger LOGGER = LogManager.getLogger(DbMainTerminalApp.class);

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean go = true;
		DbWorks dbWorks = new DbWorksImpl();
		System.out.println("Enter your userId to Validate: ");
		int userId = scan.nextInt();
		System.out.println("Enter Password :");
		scan.nextLine();
		String password = scan.nextLine();

		User validUser = dbWorks.validateUserId(userId, password);
		
		if (validUser != null) {
			LOGGER.info(validUser.getUserName()+ ", Logged in..");
			System.out.println("Hello, "+validUser.getUserName()+"  ------YOU HAVE ENTERED DB TERMINAL PLEASE FOLLOW THE INSTRUCTIONS");
			while (go) {
				System.out.println("Enter 1 to create new user");
				System.out.println("Enter 2 to read all users data");
				System.out.println("Enter 3 to update user");
				System.out.println("Enter 4 to remove an user");
				System.out.println();
				int choice = scan.nextInt();
				switch (choice) {
				case 1:
					System.out.println("Please have no spaces in username or password as it have to be single word");
					System.out.println();
					System.out.println("Enter username ");
					scan.nextLine();
					String name = scan.nextLine();
					System.out.println("Enter password ");
					String password1 = scan.nextLine();
					User user = dbWorks.createUser(name, password1);
					if (user != null) {
						System.out.println(user);
					} else {
						System.out.println("dommmm");
					}
					break;
				case 2:
					dbWorks.readAllUsers();
					break;
				case 3:
					System.out.println("Please have no spaces in username or password as it have to be single word");
					System.out.println();
					System.out.println("Enter user id ");
					int id = scan.nextInt();

					User checkUser = dbWorks.readByUserId(id);

					if (checkUser.getUserName() != null) {
						System.out.println("Enter username ");
						scan.nextLine();
						String name1 = scan.nextLine();
						System.out.println("Enter password ");
						String password11 = scan.nextLine();
						dbWorks.updateUser(id, name1, password11);
					} else {
						System.out.println("Employee id not found !!");
					}

					break;
				case 4:
					System.out.println("Enter user id ");
					int id2 = scan.nextInt();
					User checkUser1 = dbWorks.readByUserId(id2);
					if (checkUser1.getUserName() != null) {
						dbWorks.deleteUserById(id2);
					} else {
						System.out.println("Employee id not found !!");
					}

					break;
				default:
					go = false;
				}
				System.out.println();
			}
			LOGGER.info(validUser.getUserName()+" Logged out...!");
			System.out.println("----------Thanks for using Our DB, Happy DBing....!----------");
			scan.close();
		} else {
			LOGGER.info("Some unknown User with id :"+ userId+ " tried logging in...");
			System.err.println("Sorry, you are not authorized, Please contact Tech Team !!!!!");
		}
	}
}

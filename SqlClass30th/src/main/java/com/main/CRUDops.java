package com.main;

import java.util.List;
import java.util.Scanner;

import com.dao.UserDao;
import com.dao.UserDaoImpl;
import com.model.User;

public class CRUDops {

	public static void main(String[] args) {

		UserDao userDao= new UserDaoImpl();
		List<User> resultObjs= userDao.readAllUser();
		//java8 feature
		resultObjs.stream().forEach((arg)->{
			System.out.println(arg);
		});
		
//		for (User user : resultObjs) {
//			System.out.println(user);
//		}
		//we can use scanner to update dynamically
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter Username : ");
		String userName= scanner.next();
		System.out.println("Enter password : ");
		String password= scanner.next();
		scanner.close();
		User user= new User(userName, password);
		User userFromDao = userDao.createUser(user);
		if (userFromDao != null) {
			System.out.println(userFromDao);
			System.out.println("Updated sucessfully !!! with user ID: "+ userFromDao.getUserId());
		} else {
			System.out.println("----------------------");

		}
	}

}

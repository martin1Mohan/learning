package com.methodReference;

import com.service.InterfaceStatic;

public class StaticMethodDemo {
	
	public static String myFun(String var) {
		String ans= "Welcome to static method, "+ var;
		return ans;
	}

	public static void main(String[] args) {

		InterfaceStatic static1= StaticMethodDemo::myFun;
		
		System.out.println(static1.greet("Mohan Murali Rao"));
	}

}

package com.methodReference;

import com.service.MyInterface;

public class InstanceMethodDemo {

	public void myFunction() {
		System.out.println("Welcome to method refereance!!");
	}
	public static void main(String[] args) {

		MyInterface myInterface= ()-> System.out.println("welcome to lamda");
		
		myInterface.display();
		
		//Intance method.
		InstanceMethodDemo demo= new InstanceMethodDemo();
		MyInterface myInterface2= demo::myFunction;
		myInterface2.display();
		
	}

}

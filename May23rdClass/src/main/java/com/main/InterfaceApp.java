package com.main;

import com.service.Interface1;
import com.service.Interface1Impl;
import com.service.InterfaceOneImpl;

public class InterfaceApp {

	public static void main(String[] args) {

		Interface1 interface1Impl= new Interface1Impl(); //abstraction
		Interface1 interfaceOneImpl= new InterfaceOneImpl(); 
		
		interface1Impl.functionOne();
		System.out.println("Add function using default: "+ interface1Impl.add(2, 3));
		interfaceOneImpl.functionOne();
		System.out.println("Add function using default: "+ interfaceOneImpl.add(1, 3));
	}

}

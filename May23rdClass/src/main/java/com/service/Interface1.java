package com.service;

public interface Interface1 {

	public static final int INTVAR= 100;
	
	public abstract void functionOne(); //method declearation
	
	public default int add(int num1, int num2) {
		return num1+num2;
	}
}

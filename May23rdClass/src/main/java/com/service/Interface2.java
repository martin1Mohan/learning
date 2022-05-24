package com.service;

public interface Interface2 {

	public default int add(int num1, int num2) {
		return num1+num2;
	}
}

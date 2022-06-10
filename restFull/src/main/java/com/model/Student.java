package com.model;

public class Student {

	private int stdNo;
	private String stdName;

	public Student() {
		super();
	}

	public int getStdNo() {
		return stdNo;
	}

	public void setStdNo(int stdNo) {
		this.stdNo = stdNo;
	}

	public String getStdName() {
		return stdName;
	}

	public void setStdName(String stdName) {
		this.stdName = stdName;
	}

	public Student(int stdNo, String stdName) {
		super();
		this.stdNo = stdNo;
		this.stdName = stdName;
	}

}

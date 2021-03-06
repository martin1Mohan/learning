package com.model;

public class Student {

	private int stdId;
	private String stdName;
	private int age;
	private int marks;

	public Student(int stdId, String stdName, int age, int marks) {
		super();
		this.stdId = stdId;
		this.stdName = stdName;
		this.age = age;
		this.marks = marks;
	}

	public Student() {
		super();
	}

	public int getStdId() {
		return stdId;
	}

	public void setStdId(int stdId) {
		this.stdId = stdId;
	}

	public String getStdName() {
		return stdName;
	}

	public void setStdName(String stdName) {
		this.stdName = stdName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [stdId=" + stdId + ", stdName=" + stdName + ", age=" + age + ", marks=" + marks + "]";
	}

}

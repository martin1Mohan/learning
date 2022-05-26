package com.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.model.SortByAge;
import com.model.Student;

public class CollegeApp {

	public static void main(String[] args) {

		Student student1= new Student(1, "Mohan", 23, 99);
		Student student2= new Student(2, "Sai", 20, 90);
		Student student3= new Student(3, "Sudheer", 23, 80);
		Student student4= new Student(4, "Gopi", 24, 100);
		Student student5= new Student(5, "Ravi", 25, 88);
		
		List<Student> students= new ArrayList<Student>();
		
		students.add(student1);
		students.add(student2);
		students.add(student3);
		students.add(student4);
		students.add(student5);
		
		Collections.sort(students, new SortByAge());
		
		for (Student student : students) {
			System.out.println("Name: "+ student.getStdName() + " : " + "Age : "+ student.getAge());
		}
		
	}

}

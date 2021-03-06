package com.main;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.model.Student;

public class MapDemo {

	public static void main(String[] args) {

		Student student1 = new Student(1, "Mohan", 23, 99);
		Student student2 = new Student(2, "Sai", 20, 90);
		Student student3 = new Student(3, "Sudheer", 23, 80);
		Student student4 = new Student(4, "Gopi", 24, 100);
		Student student5 = new Student(5, "Ravi", 25, 88);

		Map<String, Student> map = new HashMap<String, Student>();

		map.put("A", student1);
		map.put("B", student2);
		map.put("C", student3);
		map.put("D", student4);
		map.put("E", student5);

		Set<Entry<String, Student>> set = map.entrySet();
		Iterator<Entry<String, Student>> itr = set.iterator();
		while (itr.hasNext()) {
			Entry<String, Student> entry = itr.next();
			System.out.println(entry.getKey() + " " + entry.getValue());

		}

	}
}

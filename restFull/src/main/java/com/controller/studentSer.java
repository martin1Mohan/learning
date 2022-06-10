package com.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.Student;

@RestController
public class studentSer {

	@RequestMapping("getStudent")
	public Student getStudent() {
		return new Student(1, "Mohan");
	}
}

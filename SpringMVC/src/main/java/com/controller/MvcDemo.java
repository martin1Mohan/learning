package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MvcDemo {

	@RequestMapping("fun1") //http://localhost:8080/<projectName>/fun1/
	public String myFunction1(){
		return "success";
	}
	
	@RequestMapping("fun2")  //http://localhost:8080/<projectName>/fun2/
	public String myFunction2(){
		return "thanks";
	}

}

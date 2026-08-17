package com.example.demo.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class OurControllerClass {
	
	//Conditional Rendering
	
	@GetMapping("/check")
	public String checkStudent(Model model) {
		int age = 13;
		model.addAttribute("age", age);
		
		return "check";
	}
	
	//Iteration over list
	
	@GetMapping("/students")
	public String students(Model model) {

	    List<String> students = List.of("Apoorva", "Rahul", "Sneha", "Munna");

	    model.addAttribute("students", students);

	    return "students";
	}
}

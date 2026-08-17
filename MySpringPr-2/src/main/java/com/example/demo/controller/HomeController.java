package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class HomeController {

	@GetMapping("/")
	public String home() {
		return "home";
	}
	
	@GetMapping("/home")
	public String homePage(@RequestParam String name, Model model ) {
		String username = name;
		model.addAttribute("username", username);
		return "homepage";
	}
	
	@GetMapping("/student/page")
	public String student(Model model) {

	    model.addAttribute("name", "Apoorva");
	    model.addAttribute("age", 23);
	    model.addAttribute("course", "Java Full Stack");

	    return "student";
	}
	
}

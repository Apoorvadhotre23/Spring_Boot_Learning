package com.example.demo.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class WebApplication {
	
	@GetMapping("/")
	@ResponseBody
	public String greet() {
		return "Hello World";
	}

	@GetMapping("/greet")
	@ResponseBody
	public String greetUser(@RequestParam String username) {
		return "Hello " + username;
	}
	
	@GetMapping("/greet/{name}")
	@ResponseBody
	public String greetUserName(@PathVariable String name) {
		return "Hello " + name;
	}
	
	@GetMapping("/display")
	@ResponseBody
	public String getName(@RequestBody Map<String, String> body) {
		return "Hello " + body.get("username");
	}
}

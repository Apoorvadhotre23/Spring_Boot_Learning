package com.example.rest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Authentication {

	@GetMapping("/page/user")
	public String user() {
		return "Welcome to user";
	}
	
	@GetMapping("/page/admin")
	public String admin() {
		return "Welcome to admin";
	}
}

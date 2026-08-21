package com.example.rest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecurityApp {

	@GetMapping("/users/dashboard")
	public String DashBoard() {
		return "Hello this is Our dashBoard";
	}
}

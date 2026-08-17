package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Developer {

	@Autowired
	Computer cmp;
	public Developer(Computer cmp) {
		this.cmp = cmp;
	}
	
	public void develop() {
		cmp.taskHandling();
	}
}

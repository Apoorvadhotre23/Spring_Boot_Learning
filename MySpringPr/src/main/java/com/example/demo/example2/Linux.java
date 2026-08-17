package com.example.demo.example2;

import org.springframework.stereotype.Component;

@Component
public class Linux implements Os{

	@Override
	public void operate() {
		System.out.println("Linux Operating system");
		
	}
	
}

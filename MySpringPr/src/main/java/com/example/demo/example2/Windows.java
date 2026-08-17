package com.example.demo.example2;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Windows implements Os{

	@Override
	public void operate() {
		System.out.println("Windows Operating System");
	}

}

package com.example.demo;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import com.example.demo.example2.Os_System;


@SpringBootApplication
public class MySpringPrApplication {

	public static void main(String[] args) {
		ApplicationContext ac = SpringApplication.run(MySpringPrApplication.class, args);
		
//		Laptop laptop = ac.getBean(Laptop.class);
//		laptop.build();
//		
//		Developer d = ac.getBean(Developer.class);
//		d.develop();
		
		Os_System sys = ac.getBean(Os_System.class);
		sys.build();
		
	}

}

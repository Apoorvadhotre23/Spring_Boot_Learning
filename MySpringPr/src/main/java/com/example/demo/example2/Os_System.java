package com.example.demo.example2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Os_System {
	@Autowired
	Os os;
	public void build() {
		os.operate();
	}
}

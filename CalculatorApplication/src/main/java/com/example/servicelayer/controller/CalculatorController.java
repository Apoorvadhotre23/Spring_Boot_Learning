package com.example.servicelayer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.servicelayer.service.CalculatorService;


@Controller
public class CalculatorController {
	
	@GetMapping("/")
	public String home() {
		return "homepage";
	}
	
	CalculatorService service;
	
	public CalculatorController(CalculatorService service) {
		this.service = service;
	}
	
	@GetMapping("/calculate")
	public String add(@RequestParam("n1") int n1, @RequestParam("n2") int n2, @RequestParam("operation") String operation, Model model) {
		
		double result = 0;
		
		switch(operation) {
		case "add":
			    result =  service.add(n1, n2);
			    break;
		
	   case "subtract":
		         result =  service.subtract(n1, n2);
		         break;
		         
	   case "multiply":
		         result = service.multiply(n1, n2);
		         break;
	   case "divide":
		   		if(n2!=0) {
		   	     result = service.divide(n1, n2);
		   		}else {
		   			model.addAttribute("error", "Division Not possible");
		   		}
		   	    break;
	   }
		
	   model.addAttribute("res", result);
	   return "result";
		
	}
}

package com.example.rest.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.rest.entity.Spring_Emp;
import com.example.rest.service.EmployeeService;

@RestController
public class EmployeeController {
	
	EmployeeService empService;
	
	public EmployeeController(EmployeeService empService) {
		this.empService = empService;
  }
	
	// getEmployee by id
	@GetMapping("/users/{id}")
	public Spring_Emp getEmployee(@PathVariable("id") int id) {
		return empService.getEmployee(id);
	}
	
	// get all employee
	@GetMapping("/users/all")
	public List<Spring_Emp> getAll() {
		return empService.getAll();
	}
	
	//create
	@PostMapping("/users/create")
	public Spring_Emp create(@RequestBody Spring_Emp emp) {
		return empService.create(emp);
	}
	
	//update
	@PutMapping("/users/update")
	public Spring_Emp update(@RequestBody Spring_Emp emp) {
		return empService.update(emp);
	}
	
	//delete 
	@DeleteMapping("/users/delete/{id}")
	public String delete(@PathVariable("id") int id) {
		return empService.delete(id);
	}

}
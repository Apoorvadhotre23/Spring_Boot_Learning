package com.example.rest.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.rest.entity.Spring_Emp;
import com.example.rest.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	EmployeeRepository empRepo;
	
	public EmployeeService(EmployeeRepository empRepo) {
		this.empRepo = empRepo;
	}
	
	//create
	public Spring_Emp create(Spring_Emp emp) {
		return empRepo.save(emp);
	}
	
	
	//read
	public Spring_Emp getEmployee(int id) {
		Spring_Emp e = empRepo.findById(id).orElse(null);
		return e;
	}
	
	//read all
	public List<Spring_Emp> getAll() {
		return empRepo.findAll();
	}
	
	//update 
	public Spring_Emp update(Spring_Emp emp) {
		return empRepo.save(emp);
	}
	
	//delete
	public String delete(int id) {
		if(empRepo.existsById(id)) {
			 empRepo.deleteById(id);
			 return "Employee deleted sucessfully";
		} else {
			return "Employee Not found";
		}
		
	}
	
}

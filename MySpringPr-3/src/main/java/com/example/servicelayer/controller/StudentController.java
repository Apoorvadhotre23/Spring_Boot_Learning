package com.example.servicelayer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.servicelayer.service.StudentService;


@Controller
public class StudentController {

	 
	 StudentService studentService;
	 
	 public StudentController(StudentService studentService) {
		 this.studentService = studentService;
	 }	 

	    @GetMapping("/studentp")
	    @ResponseBody
	    public String student() {

	        return studentService.getStudentName();
	    }

		
}

package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class StudentController {

    @GetMapping("/student")
    public String showForm(Model model) {

        Student student = new Student();

        model.addAttribute("student", student);

        return "student-form";
    }

    @PostMapping("/student/save")
    public String saveStudent(@ModelAttribute Student student) {

        System.out.println("Name: " + student.getName());
        System.out.println("Email: " + student.getEmail());
        System.out.println("Age: " + student.getAge());

        return "success";
    }
}
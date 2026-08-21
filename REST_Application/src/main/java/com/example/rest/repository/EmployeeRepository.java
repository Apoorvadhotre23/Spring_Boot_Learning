package com.example.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.rest.entity.Spring_Emp;

public interface EmployeeRepository extends JpaRepository<Spring_Emp, Integer>{

}

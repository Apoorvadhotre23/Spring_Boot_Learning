package com.example.rest.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Spring_Emp")
public class Spring_Emp {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int id;
	
	@Column
	String name;
	
	@Column
	String email;
	
	@Column
	double salary;
	
	@Column
	String designation;
	
	public Spring_Emp() {
		// TODO Auto-generated constructor stub
	}

	public Spring_Emp(int id, String name, String email, double salary, String designation) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.salary = salary;
		this.designation = designation;
	}

	public Spring_Emp(String name, String email, double salary, String designation) {
		super();
		this.name = name;
		this.email = email;
		this.salary = salary;
		this.designation = designation;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	
}

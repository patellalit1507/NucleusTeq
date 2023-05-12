package com.laitpatel.springbootrestapi.model;

import lombok.Data;

public class Employee {
     private String name;
     private String location;
     private String email;
     private String department;
     private Integer id ;
	public Employee(String name, String location, String email, String department, Integer id) {
		super();
		this.name = name;
		this.location = location;
		this.email = email;
		this.department = department;
		this.id = id;
	}
     
	public Employee() {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", location=" + location + ", email=" + email + ", department=" + department
				+ ", id=" + id + "]";
	}
	
	
     
}

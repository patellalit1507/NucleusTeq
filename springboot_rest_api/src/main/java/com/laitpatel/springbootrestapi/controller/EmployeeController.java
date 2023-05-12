package com.laitpatel.springbootrestapi.controller;


import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.laitpatel.springbootrestapi.model.Employee;
import com.laitpatel.springbootrestapi.services.EmployeeServices;

//import lombok.Value;

@RestController
public class EmployeeController {
	 
	@Autowired
    private EmployeeServices employeeServices;
	
	@Value("${app.name}")
	private String appName;
	
	@Value("${app.version}")
	private String appversion;  
	
	@GetMapping("/version") 
    public String getAppDetails() {
    	return appName+" "+appversion;
    }
	
	
//	@RequestMapping(value  =  "/employees" , method=RequestMethod.GET)
	@GetMapping("/employees")
	public List<Employee> getEmployees(){
		
		
		return  this.employeeServices.getAllBooks() ;
	}
	
	@GetMapping("/employees/{id}")
	public Employee getEmployee(@PathVariable("id") Integer id) {
		return employeeServices.getEmployeeById(id);
	}
	
	@PutMapping(value="/employees/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
	public Employee updateEmployee(@PathVariable("id") Integer id,@RequestBody Employee employee ) {
		System.out.println( "Employee Updated Succesfully "+id);
		return employee;
	}
	
	@PostMapping(value="/employees")
	public Employee saveEmployee(@RequestBody Employee employee) {
		 Employee e=this.employeeServices.addingEmployee(employee);
		return e;
	    
	}
	
	//localhost:8080/employees?id=34  
	@DeleteMapping("/employees/{bid}")
	public void deleteEmployee(@PathVariable("bid") Integer bid) {
		this.employeeServices.deleteEmployee(bid);
	}
  
}
   
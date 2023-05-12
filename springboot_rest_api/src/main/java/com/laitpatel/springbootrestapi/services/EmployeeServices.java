package com.laitpatel.springbootrestapi.services;
import java.util.*;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.laitpatel.springbootrestapi.model.Employee;

@Service
public class EmployeeServices {

	
	  private static List<Employee> list=new ArrayList<>();
	  static {
		  list.add(new Employee("Lalit","Indore","patel@gmail.com","HR",1));
		  list.add(new Employee("Nikhil","Indore","niks@gmail.com","Social Media",2));
		  list.add(new Employee("Kartik","Bhopal","ktk@gmail.com","Teaching",3));

		 
	  }
	   
	  public List<Employee> getAllBooks(){
		  return list;
	  }
	  
	  public Employee getEmployeeById(Integer id) {
		  Employee emplo=null;
		  emplo=list.stream().filter(e->e.getId()==id).findFirst().get();
		  return emplo;
	  }
	  
	  public Employee addingEmployee(Employee e) {
		  list.add(e);
		  return e;
	  }
	  
	  public void deleteEmployee(Integer bid) {
		  list=list.stream().filter(emp->emp.getId()!=bid).collect(Collectors.toList());
	  }
}

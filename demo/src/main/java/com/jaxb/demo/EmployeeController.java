package com.jaxb.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	
	@Autowired 
	EmployeeService employeeService;
	
	@GetMapping("/v1/employee")
	public String getAllEmplyees() {
		employeeService.getAllEmployees();
		
		return null;
	}

}

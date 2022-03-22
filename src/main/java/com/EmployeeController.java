package com.training.jpatraining;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.training.jpatraining.entities.Employee;
import com.training.jpatraining.repositories.EmployeeRepository;

@RestController
@RequestMapping("/api")
public class EmployeeController {
	
	
	@Autowired
	EmployeeRepository employeeRepository;

	
	@GetMapping("/hello-world")
	public String gethelloWorld() {
		return "hello world";
	}
	
	
	@GetMapping("/getAllEmployees")
	public List<Employee> getAllEmployees() {
		
		return employeeRepository.findAll();
	
	}
	
	
	@GetMapping("/getEmployee")
	public Employee getEmployeeByID(@RequestParam(name="id") Long id){
		
		return employeeRepository.getById(id);
		
		
	}
}


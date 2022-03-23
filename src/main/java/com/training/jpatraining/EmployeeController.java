package com.training.jpatraining;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	public Employee getAnEmployee(@RequestParam(value="id")Long id) {
		
		Optional<Employee> employee =employeeRepository.findById(id);
		
		return employee.get();
	}
	
	
	@PostMapping("/postEmployee")
	public Employee postAnEmployee(@RequestBody Employee employee) {
		return employeeRepository.save(employee);
	}

	@GetMapping("/getEmployeeWithAge")
	public List<Employee> getEmployeeWithAgeGreaterThan(@RequestParam(value="age") int age) {
		
		return employeeRepository.findByAgeGreaterThan(age);
	}
	
	@GetMapping("/getEmployeeOlderThan30")
	public List<Employee> getEmployeeWithAgeGreaterThan30() {
		
		return employeeRepository.getEmployeesOfAgeGreaterThan30();
	}
	
	@GetMapping("/getEmployeeOlderThan")
	public List<Employee> getEmployeeWithAgeGreaterThanUserDefinedAge(@RequestParam(value="age") int age) {
		
		return employeeRepository.getEmployeesOfAgeGreaterThan(age);
	}
	
}


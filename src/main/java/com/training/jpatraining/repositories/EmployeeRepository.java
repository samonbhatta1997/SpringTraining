package com.training.jpatraining.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.training.jpatraining.entities.Employee;


@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long> {
	
	
	public List<Employee> findByAgeGreaterThan(int age);
	
	
	@Query(value="SELECT * from Employee1 WHERE age>30",nativeQuery=true)
	public List<Employee> getEmployeesOfAgeGreaterThan30();

	
	
	@Query(value="SELECT * from Employee1 WHERE age> :age",nativeQuery=true)
	public List<Employee> getEmployeesOfAgeGreaterThan(int age);
}

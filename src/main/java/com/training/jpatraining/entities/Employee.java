package com.training.jpatraining.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Employee1")
public class Employee implements Serializable{
	
	@Id
	private Long id;
	
	private String name;
	private int age;
	
	
	public Employee() {
		super();
	}


	public Employee(Long id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}
	
	

}

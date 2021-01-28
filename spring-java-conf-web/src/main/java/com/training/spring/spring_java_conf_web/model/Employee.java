package com.training.spring.spring_java_conf_web.model;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class Employee {

	private String name;
	private String gender;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Employee() {
	}

	public Employee(String name, String gender) {
		this.name = name;
		this.gender = gender;
	}
	
}

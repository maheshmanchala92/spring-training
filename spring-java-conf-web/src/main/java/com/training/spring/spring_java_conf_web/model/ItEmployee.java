package com.training.spring.spring_java_conf_web.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class ItEmployee extends Employee {

	@Id
	@GeneratedValue
	private Integer emplId;
	private Integer salary;
	private String email;

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}

	public ItEmployee(Integer salary) {
		super();
		this.salary = salary;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public ItEmployee() {
	}

	public ItEmployee(Integer salary, String email) {
		this.salary = salary;
		this.email = email;
	}

	public long getEmplId() {
		return emplId;
	}

	public void setEmplId(Integer emplId) {
		this.emplId = emplId;
	}

	public ItEmployee(Integer emplId, Integer salary, String email) {
		super();
		this.emplId = emplId;
		this.salary = salary;
		this.email = email;
	}
	
}
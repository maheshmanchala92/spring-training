package com.training.spring.spring_java_conf_web.model;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "Person_Table")
public class Person {//Person_Table

	@EmbeddedId
	private PersonComposite composite;

	private String firstName;
	private String lastName;
	private Integer age;

	public PersonComposite getComposite() {
		return composite;
	}

	public void setComposite(PersonComposite composite) {
		this.composite = composite;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Person(PersonComposite composite, String firstName, String lastName, Integer age) {
		this.composite = composite;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}

	public Person() {
	}
}

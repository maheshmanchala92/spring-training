package com.training.spring.spring_java_conf_web.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Address {

	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private Long adderssId;
	private String location;

	public Long getAdderssId() {
		return adderssId;
	}

	public void setAdderssId(Long adderssId) {
		this.adderssId = adderssId;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Address(Long adderssId, String location) {
		super();
		this.adderssId = adderssId;
		this.location = location;
	}

	public Address(String location) {
		super();
		this.location = location;
	}

	public Address() {
		super();
	}
}

package com.training.spring.spring_java_conf_web.model;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class PersonComposite implements Serializable {

	private String email;
	private String pancardNo;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPancardNo() {
		return pancardNo;
	}

	public void setPancardNo(String pancardNo) {
		this.pancardNo = pancardNo;
	}

	public PersonComposite(String email, String pancardNo) {
		this.email = email;
		this.pancardNo = pancardNo;
	}

	public PersonComposite() {
	}
}

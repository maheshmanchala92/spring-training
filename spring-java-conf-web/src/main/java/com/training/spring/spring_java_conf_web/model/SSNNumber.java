package com.training.spring.spring_java_conf_web.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class SSNNumber {
	@Id
	@GeneratedValue
	private Long id;
	private Long ssnNo;

	@OneToOne(mappedBy = "ssn")
	private UserDetails userDetails;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getSsnNo() {
		return ssnNo;
	}

	public void setSsnNo(Long ssnNo) {
		this.ssnNo = ssnNo;
	}

	@Override
	public String toString() {
		return "SSNNumber [id=" + id + ", ssnNo=" + ssnNo + ", userDetails=" + userDetails + "]";
	}
}

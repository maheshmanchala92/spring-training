package com.training.spring.spring_java_conf_web.model;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("truck")
public class SixWheeler extends Vehicle {
	
	@Column(name = "STEERING_TYPE")
	private String steeringFourWheeler;
	
	private Integer gares;

	public String getSteeringFourWheeler() {
		return steeringFourWheeler;
	}

	public void setSteeringFourWheeler(String steeringFourWheeler) {
		this.steeringFourWheeler = steeringFourWheeler;
	}

	public Integer getGares() {
		return gares;
	}

	public void setGares(Integer gares) {
		this.gares = gares;
	}
	
}
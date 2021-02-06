package com.training.spring.spring_java_conf_web.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/*
 * @Entity //@Table(name="FOUR_WHEELER") //@DiscriminatorValue("Car") public
 * class FourWheeler extends Vehicle {
 * 
 * private String steeringFourWheeler;
 * 
 * public String getSteeringFourWheeler() { return steeringFourWheeler; }
 * 
 * public void setSteeringFourWheeler(String steeringFourWheeler) {
 * this.steeringFourWheeler = steeringFourWheeler; } }
 */

@Entity
@Table(name = "FOUR_WHEELER")
public class FourWheeler extends Vehicle {
	
	@Column(name = "STEERING_TYPE")
	private String steeringFourWheeler;

	public String getSteeringFourWheeler() {
		return steeringFourWheeler;
	}

	public void setSteeringFourWheeler(String steeringFourWheeler) {
		this.steeringFourWheeler = steeringFourWheeler;
	}
}
package com.training.spring.spring_java_conf_web.model;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
//@Table(name="TWO_WHEELER")
//@DiscriminatorValue("Bike")
@PrimaryKeyJoinColumn(name="VEHICLE_ID")
public class TwoWheeler extends Vehicle {
	private String steeringTwoWheeler;
	
	private String modelName;

	public String getSteeringTwoWheeler() {
		return steeringTwoWheeler;
	}

	public void setSteeringTwoWheeler(String steeringTwoWheeler) {
		this.steeringTwoWheeler = steeringTwoWheeler;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	
	
}

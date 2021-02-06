package com.training.spring.spring_java_conf_web.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name = "VEHICLE")
//@Inheritance(strategy = InheritanceType.SINGLE_TABLE) // Least normalisation strategy
//@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS) //slightly more normalized
@Inheritance(strategy=InheritanceType.JOINED)//Highly normalized
public class Vehicle {
	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO) //for SINGLE_TABLE
	@GeneratedValue(strategy=GenerationType.TABLE)// for TABLE_PER_CLASS
	@Column(name = "VEHICLE_ID")
	private int vehicleId;

	@Column(name = "VEHICLE_NAME")
	private String vehicleName;

	public int getVehicleId() {
		return vehicleId;
	}

	public void setVehicleId(int vehicleId) {
		this.vehicleId = vehicleId;
	}

	public String getVehicleName() {
		return vehicleName;
	}

	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}
}

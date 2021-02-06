package com.training.spring.spring_java_conf_web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.spring.spring_java_conf_web.repository.VehicleRepository;

@Service
public class VehicleServiceImpl implements VehicleService {

	@Autowired
	private VehicleRepository vehicleRepository;
	
	@Override
	public void saveVehicle() {
		vehicleRepository.saveVehicle();
	}

}

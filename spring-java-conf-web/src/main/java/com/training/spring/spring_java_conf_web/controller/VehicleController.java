package com.training.spring.spring_java_conf_web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.training.spring.spring_java_conf_web.service.VehicleService;

@Controller
public class VehicleController {
	
	@Autowired
	private VehicleService vehicleService;
	
	@RequestMapping(value = "/saveVehicle")
	public ModelAndView saveVehicle() {
		vehicleService.saveVehicle();
		return new ModelAndView("home");
	}

}

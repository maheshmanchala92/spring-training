package com.training.spring.spring_java_conf_web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.training.spring.spring_java_conf_web.model.ItEmployee;
import com.training.spring.spring_java_conf_web.service.EmployeeService;

@Controller
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@RequestMapping("/addEmployee")
	public ModelAndView addEmployee() {
		ModelAndView mav = new ModelAndView("addEmployee");
		return mav;
	}
	
	@RequestMapping(value = "/saveEmployee", method = RequestMethod.POST)
	public ModelAndView saveEmployee(ItEmployee employee) {
		employeeService.saveEmployee(employee);
		return addEmployee();
	}

}

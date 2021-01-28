package com.training.spring.spring_java_conf_web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.spring.spring_java_conf_web.model.ItEmployee;
import com.training.spring.spring_java_conf_web.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public void saveEmployee(ItEmployee employee) {
		employeeRepository.saveEmployee(employee);
	}
}

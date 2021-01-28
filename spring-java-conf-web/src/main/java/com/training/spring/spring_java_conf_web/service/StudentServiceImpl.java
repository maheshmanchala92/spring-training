package com.training.spring.spring_java_conf_web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.spring.spring_java_conf_web.model.Course;
import com.training.spring.spring_java_conf_web.model.Student;
import com.training.spring.spring_java_conf_web.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository repository;

	@Override
	public void save(Student student) {
		repository.save(student);
	}

	@Override
	public List<Course> getCourses() {
		return repository.getCourses();
	}
	
}

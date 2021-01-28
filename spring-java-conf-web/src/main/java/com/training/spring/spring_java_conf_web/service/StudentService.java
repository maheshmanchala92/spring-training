package com.training.spring.spring_java_conf_web.service;

import java.util.List;

import com.training.spring.spring_java_conf_web.model.Course;
import com.training.spring.spring_java_conf_web.model.Student;

public interface StudentService {

	void save(Student student);

	List<Course> getCourses();

}

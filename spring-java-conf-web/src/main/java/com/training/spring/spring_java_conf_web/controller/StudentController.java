package com.training.spring.spring_java_conf_web.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.training.spring.spring_java_conf_web.model.Course;
import com.training.spring.spring_java_conf_web.model.Student;
import com.training.spring.spring_java_conf_web.service.StudentService;

@Controller
public class StudentController {
	
	@Autowired
	private StudentService studentService;

	@RequestMapping("/addStudent")
	public ModelAndView addStudent() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("addStudent");
		List<Course> courses = studentService.getCourses();
		mav.addObject("allCourses", courses);
		return mav;
	}
	
	@RequestMapping(value = "/saveStudent", method = RequestMethod.POST)
	public ModelAndView saveStudent(Student student, String[] course) {
		
		List<Course> courses = new ArrayList<Course>();
		
		for (String cid : course) {
			Course c = new Course(new Integer(cid));
			courses.add(c);			
		}
		student.setCourses(courses);
		studentService.save(student);
		return addStudent();
	}
}

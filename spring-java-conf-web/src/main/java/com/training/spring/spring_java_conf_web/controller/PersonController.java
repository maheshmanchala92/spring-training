package com.training.spring.spring_java_conf_web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.training.spring.spring_java_conf_web.model.Person;
import com.training.spring.spring_java_conf_web.service.PersonService;

@Controller
public class PersonController {
	
	@Autowired
	private PersonService personService;
	
	@RequestMapping("/addPerson")
	public ModelAndView addPerson() {
		ModelAndView mav = new ModelAndView("addPerson");
		return mav;
	}
	
	@RequestMapping(value = "/savePerson", method = RequestMethod.POST)
	public ModelAndView savePerson(Person person) {
		personService.savePerson(person);
		return addPerson();
	}

}

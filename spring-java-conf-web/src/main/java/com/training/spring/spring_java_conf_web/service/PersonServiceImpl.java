package com.training.spring.spring_java_conf_web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.spring.spring_java_conf_web.model.Person;
import com.training.spring.spring_java_conf_web.repository.PersonRepository;

@Service
public class PersonServiceImpl implements PersonService {

	@Autowired
	private PersonRepository personRepository;

	@Override
	public void savePerson(Person person) {
		personRepository.savePerson(person);
	}
}

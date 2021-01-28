package com.training.spring.spring_java_conf_web.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.training.spring.spring_java_conf_web.model.Person;

@Repository
public class PersonRepository {
	
	@Autowired
	private SessionFactory factory;
	
	public Session getSession() {
		return factory.openSession();
	}

	public void savePerson(Person person) {
		Session ss = getSession();
		Transaction tx = ss.beginTransaction();
		ss.save(person);
		tx.commit();
	}

}

package com.training.spring.spring_java_conf_web.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.training.spring.spring_java_conf_web.model.ItEmployee;

@Repository
public class EmployeeRepository {

	@Autowired
	private SessionFactory factory;
	
	public Session getSession() {
		return factory.openSession();
	}
	public void saveEmployee(ItEmployee employee) {
		Session ss = getSession();
		Transaction tx = ss.beginTransaction();
		ss.save(employee);
		tx.commit();
	}

}

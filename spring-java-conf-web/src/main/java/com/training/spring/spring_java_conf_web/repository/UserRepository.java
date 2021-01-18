package com.training.spring.spring_java_conf_web.repository;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.training.spring.spring_java_conf_web.model.UserDetails;

@Repository
@Transactional
public class UserRepository {

	@Autowired
	private SessionFactory sessionFactory;

	protected Session getSession() {
		return sessionFactory.openSession();
	}

	public List<UserDetails> getUsers() {
		Query query = getSession().createQuery("from UserDetails");//select * from userDetails
		@SuppressWarnings("unchecked")
		List<UserDetails> results = query.list();
		System.out.println(results);
        return results;
	}

	public void saveUser(UserDetails user) {
		getSession().save(user);
		//session.save(entity)
		//creating insert query 
		//commit
	}
}

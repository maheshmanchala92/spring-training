package com.training.spring.spring_java_conf_web.repository;

import java.util.List;


import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
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
        return results;
	}

	public void saveUser(UserDetails user) {
		Session ss = getSession();
		Transaction tx = ss.beginTransaction();
		ss.save(user);
		tx.commit();		
	}

	public UserDetails getUserByUserId(Integer userId) {
		return (UserDetails)getSession().get(UserDetails.class, userId);
	}

	public void updateUser(UserDetails userDetails) {
		Session ss = getSession();
		Transaction tx = ss.beginTransaction();
		ss.update(userDetails);
		tx.commit();
	}
	
	public void deleteUserByUserId(Integer userId) {
		UserDetails userDetails = new UserDetails();
		userDetails.setUserId(userId);
		Session sessionObj = getSession();
		Transaction tx = sessionObj.beginTransaction();
		sessionObj.delete(userDetails);
		tx.commit();
	}
}

package com.training.spring.spring_java_conf_web.repository;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.training.spring.spring_java_conf_web.model.Course;
import com.training.spring.spring_java_conf_web.model.Student;

@Repository
public class StudentRepository {

	@Autowired
	private SessionFactory sessionFactory;

	protected Session getSession() {
		return sessionFactory.openSession();
	}

	public void save(Student student) {
		Session ss = getSession();
		Transaction tx = ss.beginTransaction();
		ss.save(student);
		tx.commit();
	}

	public List<Course> getCourses() {
		Query query = getSession().createQuery("from Course");
		
		@SuppressWarnings("unchecked")
		List<Course> coursesList = query.list();
		return coursesList;
	}
	
	
}

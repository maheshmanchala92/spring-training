package com.training.spring.spring_java_conf_web.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Student {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer sid;
	private String studentName;

	@ManyToMany(cascade = CascadeType.PERSIST)
	@JoinTable(name = "Students_Courses", 
	joinColumns = {	@JoinColumn(name = "sid") },
	inverseJoinColumns = { @JoinColumn(name = "cid") })
	private List<Course> courses;

	public Integer getSid() {
		return sid;
	}

	public void setSid(Integer sid) {
		this.sid = sid;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public List<Course> getCourses() {
		return courses;
	}

	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", studentName=" + studentName + ", courses=" + courses + "]";
	}

}

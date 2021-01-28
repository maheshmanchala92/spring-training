package com.training.spring.spring_java_conf_web.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Course {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer cid;
	private String cName;

	@ManyToMany(mappedBy = "courses")
	private List<Student> students;

	public Integer getCid() {
		return cid;
	}

	public void setCid(Integer cid) {
		this.cid = cid;
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	public Course(Integer cid, String cName) {
		super();
		this.cid = cid;
		this.cName = cName;
	}

	public Course() {
		super();
	}

	public Course(Integer cid) {
		super();
		this.cid = cid;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	@Override
	public String toString() {
		return "Course [cid=" + cid + ", cName=" + cName + ", students=" + students + "]";
	}
}

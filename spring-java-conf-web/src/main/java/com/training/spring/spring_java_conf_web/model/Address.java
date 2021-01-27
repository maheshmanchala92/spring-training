package com.training.spring.spring_java_conf_web.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Address {

	@Id
	@GeneratedValue
	private Long courseId;
	private String courseName;

	/*
	 * @ManyToOne
	 * 
	 * @JoinColumn(name = "userId", nullable = false) private UserDetails
	 * userDetails;
	 */

	public Long getCourseId() {
		return courseId;
	}

	public void setCourseId(Long courseId) {
		this.courseId = courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	/*
	 * public UserDetails getUserDetails() { return userDetails; }
	 * 
	 * public void setUserDetails(UserDetails userDetails) { this.userDetails =
	 * userDetails; }
	 */

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Address(Long courseId, String courseName) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
//		this.userDetails = userDetails;
	}

	public Address(String courseName) {
		super();
		this.courseName = courseName;
	}

	/*
	 * public Address(String courseName) { super(); this.courseName = courseName; //
	 * this.userDetails = userDetails; }
	 */
}

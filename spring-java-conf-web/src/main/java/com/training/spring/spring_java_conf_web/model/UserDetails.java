package com.training.spring.spring_java_conf_web.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class UserDetails {
	
	@Id
	@GeneratedValue
	private Integer userId;
	private String userName;
	private String password;
	private String email;
	private String courseList;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "ssnId", referencedColumnName = "id")
    private SSNNumber ssn;
	
	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
//	@JoinTable(name = "UserDetails_Address", 
//	joinColumns = { @JoinColumn(name = "userId") }, 
//	inverseJoinColumns = { @JoinColumn(name = "adderssId") })
	private List<Address> address;

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public SSNNumber getSsn() {
		return ssn;
	}

	public void setSsn(SSNNumber ssn) {
		this.ssn = ssn;
	}

	public List<Address> getAddress() {
		return address;
	}

	public void setAddress(List<Address> address) {
		this.address = address;
	}

	public UserDetails() {
		super();
	}

	public String getCourseList() {
		return courseList;
	}

	public void setCourseList(String courseList) {
		this.courseList = courseList;
	}
}
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
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "ssnId", referencedColumnName = "id")
    private SSNNumber ssn;
	
//	@OneToMany(mappedBy="userDetails")
	@OneToMany(
	        cascade = CascadeType.ALL,
	        orphanRemoval = true
	    )
    private List<Address> course;

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

	public List<Address> getCourse() {
		return course;
	}

	public void setCourse(List<Address> course) {
		this.course = course;
	}

	public UserDetails() {
		super();
	}
}
package com.training.spring.spring_java_conf_web.service;

import java.util.List;

import com.training.spring.spring_java_conf_web.model.UserDetails;

public interface UserService {

	public List<UserDetails> getUsers();

	void saveUser(UserDetails user);
}

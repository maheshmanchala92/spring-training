package com.training.spring.spring_java_conf_web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.spring.spring_java_conf_web.model.UserDetails;
import com.training.spring.spring_java_conf_web.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public List<UserDetails> getUsers() {
		return userRepository.getUsers();
	}

	@Override
	public void saveUser(UserDetails user) {
		userRepository.saveUser(user);
	}

	@Override
	public UserDetails getUserByUserId(Integer userId) {
		return userRepository.getUserByUserId(userId);
	}

	@Override
	public void updateUser(UserDetails userDetails) {
		userRepository.updateUser(userDetails);
	}

}

package com.training.springexample.service;

import java.util.List;

import org.springframework.web.multipart.commons.CommonsMultipartFile;

import com.training.springexample.model.MyFile;
import com.training.springexample.model.User;

public interface SaveUserService {
	
	
	//method decelaration
	 void saveUser(User user);
	
	 List<User>  getAllUsers();

	public abstract User getUserByUserName(String userName);
	
	public abstract void updateUser(User user);
	
	void deleteUser(User user);

	void upload(CommonsMultipartFile file);

	void saveFile(CommonsMultipartFile file);

	List<String> getAllFileNames();

	MyFile downloadFileByName(Integer id);

}

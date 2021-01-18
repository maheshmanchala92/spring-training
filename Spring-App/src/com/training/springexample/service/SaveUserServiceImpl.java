package com.training.springexample.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import com.training.springexample.dao.SaveUserRepository;
import com.training.springexample.model.MyFile;
import com.training.springexample.model.User;

/**
 * 
 * This is for testing
 * 
 * @author Mahesh Manchala
 *
 *@see save repo class 
 *
 *
 */
@Service
public class SaveUserServiceImpl implements SaveUserService {
	
	/**
	 * mahesh testing comments
	 */
	@Autowired
	private SaveUserRepository saveUserRepository;

	@Override
	public void saveUser(User user) {
		//business logic - 1
		
		/*
		jfdkjs
		lfjkldsa
		fjkdjlk
		*/
		
		/**
		klfdas
		fdkajf
		dkjf
		klfdjfk
		kldjf
		*/
		
		
		
		saveUserRepository.saveUserToDataBase(user);
	}
	
	@Override
	public List<User>  getAllUsers(){
		
		List<User> userList = saveUserRepository.getAllUsers();
		System.out.println(userList);
		return userList;
	}

	@Override
	public User getUserByUserName(String userName) {
		User user = saveUserRepository.getUserByUserName(userName);
		return user;
	}

	@Override
	public void updateUser(User user) {
		//Repo
		saveUserRepository.updateUser(user);
		
	}	
	
	@Override
	public void deleteUser(User user) {
		saveUserRepository.deleteUser(user);
		
	}

	@Override
	public void upload(CommonsMultipartFile file) {
		saveUserRepository.upload(file);
		
	}

	@Override
	public void saveFile(CommonsMultipartFile file) {
		saveUserRepository.saveFile(file);
		
	}

	@Override
	public List<String> getAllFileNames() {
		return saveUserRepository.getAllFileNames();
	}

	@Override
	public MyFile downloadFileByName(Integer id) {
		return saveUserRepository.downloadFileByName(id);
	}

	
	/*
	 * public SaveUserRepository getSaveUserRepository() { return
	 * saveUserRepository; }
	 * 
	 * public void setSaveUserRepository(SaveUserRepository saveUserRepository) {
	 * this.saveUserRepository = saveUserRepository; }
	 */
	
}

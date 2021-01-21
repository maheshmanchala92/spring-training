package com.training.spring.spring_java_conf_web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.training.spring.spring_java_conf_web.model.UserDetails;
import com.training.spring.spring_java_conf_web.service.UserServiceImpl;

@Controller
public class FirstController {
	
	@Autowired
	private UserServiceImpl userServiceImpl;
	
	@RequestMapping(value = "/home")
	public ModelAndView home() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("home");
		return mav;
	}
	
	@RequestMapping(value = "/viewAllUsers")
	public ModelAndView viewAllUsers() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("viewAllUsers"); //WEB-INF/views/viewAllUsers.jsp
		List<UserDetails> listUsers = userServiceImpl.getUsers();
		mav.addObject("allUsers", listUsers);
		return mav;
	}
		
	@RequestMapping(value = "/addUser") //GET
	public ModelAndView addUser() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("addUser");//WEB-INF/
		return mav;
	}
	
	@RequestMapping(value = "/saveUser", method = RequestMethod.POST)
	public ModelAndView sendUserNameModel(UserDetails user) {
		userServiceImpl.saveUser(user);
		// call Repository - >store user name and pwd in table
		return viewAllUsers(); // /WEB-INF/views/viewAllUsers.jsp
	}
	
	@RequestMapping(value ="/editUser")//GET
	public ModelAndView editUser(@RequestParam Integer userId) {
		UserDetails userDetails = userServiceImpl.getUserByUserId(userId);
		ModelAndView mav = new ModelAndView("editUser");// /WEB-INF/views/editUser.jsp
		mav.addObject("user", userDetails);
		return mav;
	}

	@RequestMapping(value ="/updateUser",method = RequestMethod.POST)
	public ModelAndView updateUser(UserDetails userDetails) {
		userServiceImpl.updateUser(userDetails);
		return viewAllUsers() ;
	}
}

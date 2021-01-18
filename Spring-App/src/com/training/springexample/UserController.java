package com.training.springexample;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.training.springexample.model.MyFile;
import com.training.springexample.model.User;
import com.training.springexample.service.SaveUserService;

@Controller // for creating object by spring framework & providing request handling feature
//@CrossOrigin("*")
public class UserController {

	@Autowired
	private SaveUserService serviceImpl;

//	@RequestMapping("/second") // act as service of Servlet
	@RequestMapping(value = "/second", method = RequestMethod.POST) // act as service of Servlet //acts as HTTP Servlet
																	// doPost method
	public String myFirstRequest() {
		System.out.println("myFirstRequest POST");
		return "test"; // /WEB-INF/views/test.jsp
	}

	@RequestMapping(value = "/second", method = RequestMethod.GET) // act as service of Servlet //acts as HTTP Servlet
																	// doGet method
	public String myFirstRequestGet() {
		System.out.println("myFirstRequest GET");
		return "fileUpload"; // /WEB-INF/views/test.jsp
	}

	@RequestMapping("/") // act as service of Servlet
	public String homeRequest() {
		return "home"; // /WEB-INF/views/home.jsp
	}

	@RequestMapping("/third")
	public String thirdRequest() {
		System.out.println("this is third req.");
		return "third"; // /WEB-INF/views/third.jsp
	}

//	@RequestMapping("/sendUserName")
//	@RequestMapping(value = "/sendUserName")
//	@RequestMapping(value = "/sendUserName", method = RequestMethod.GET)

	@RequestMapping(value = "/sendUserName", method = RequestMethod.POST)
	public String sendUserNameModel(User user, Model model) {
//		String userNameFromUI = (String) .getAttribute("userName"); 
		System.out.println("this is sendUserName req.");
//		System.out.println(user.getUserName());
//		System.out.println(user.getPassword());
		model.addAttribute("userName1", user.getUserName());
		model.addAttribute("password", user.getPassword());
		// call Repository - >store user name and pwd in table

		serviceImpl.saveUser(user);

		return "sendUserName"; // /WEB-INF/views/sendUserName.jsp
	}

	
	// reading from ModelAndView object
	
	@RequestMapping("/getAllUsersFromDb")//get
	public ModelAndView getAllUsersFromDb() {
		List<User> userList = serviceImpl.getAllUsers();
//		ModelAndView mav = new ModelAndView("viewAllUsers");// /WEB-INF/views/viewAllUsers.jsp
		ModelAndView mav = new ModelAndView();
		mav.setViewName("viewAllUsers");// /WEB-INF/views/viewAllUsers.jsp
		mav.addObject("allUsers", userList);
		return mav; // WEB-INF/views/viewAllUsers.jsp
	} 
	 
	//reading from request object
	/*
	 * @RequestMapping("/getAllUsersForDb") public String
	 * getAllUsersFromDb(HttpServletRequest req) { 
	 * List<User> userList =
	 * serviceImpl.getAllUsers(); 
	 * req.setAttribute("allUsers",userList); 
	 * return "viewAllUsers"; // WEB-INF/views/viewAllUsers.jsp
	 * }
	 */
	
	//reading from session object
	
	/*
	 * @RequestMapping("/getAllUsersForDb") 
	 * public String
	 * getAllUsersFromDb(HttpSession httpSession) {
	 * System.out.println("session-----"); List<User> userList =
	 * serviceImpl.getAllUsers(); httpSession.setAttribute("allUsers", userList);
	 * return "viewAllUsers"; // WEB-INF/views/viewAllUsers.jsp }
	 */
	 
	
	@RequestMapping(value ="/editUser")//GET
	public ModelAndView editUser(@RequestParam String userName) {
		//service->repo->db
		User user = serviceImpl.getUserByUserName(userName);
		
//-----back		
		ModelAndView mav = new ModelAndView("editUser");// /WEB-INF/views/editUser.jsp
		mav.addObject("user1", user);
		return mav;
	}	
	
	@RequestMapping(value ="/updateUser",method = RequestMethod.POST)
	public ModelAndView updateUser(User user) {
		//UI - User -
		//service 
		serviceImpl.updateUser(user);
		//getall user from db
		//set set page name 
		// return mav
		return getAllUsersFromDb() ;
		// page 
	}
	
	@RequestMapping(value = "/deleteUser" , method = RequestMethod.DELETE)
	public ModelAndView deleteUser(@RequestParam String userName) {
		//service - userName
		System.out.println(userName);
		User user = new User();
		user.setUserName(userName);
		serviceImpl.deleteUser(user);
		return getAllUsersFromDb() ;
	}
	
	@RequestMapping(value = "/saveFile", method = RequestMethod.POST)
	public ModelAndView saveFile(@RequestParam CommonsMultipartFile file) {
		//service
		serviceImpl.saveFile(file);
		
		ModelAndView mav = new ModelAndView("home");
		
		return mav;
		
	}
	
	@RequestMapping(value = "/getAllFiles")
	public ModelAndView getAllFiles() {
		ModelAndView mav = new ModelAndView("allFiles");//   /WEB-INF/views/allFiles.jsp
		List<String> fileList = serviceImpl.getAllFileNames();
		mav.addObject("allFileNames", fileList);
		return mav;
	}
	
	@RequestMapping(value = "download")
	public ModelAndView downloadFileByName(@RequestParam Integer id, HttpServletResponse response) throws IOException {
		MyFile file = serviceImpl.downloadFileByName(id);
		
		/*
		 * try { // Initialize a pointer // in file using OutputStream OutputStream os =
		 * new FileOutputStream(new File(fileName));
		 * 
		 * // Starts writing the bytes in it // os.write(bytes);
		 * System.out.println("Successfully" + " byte inserted");
		 * 
		 * // Close the file os.close(); } catch (Exception e) {
		 * System.out.println("Exception: " + e); }
		 */
		response.setContentType("text/plain");
        response.setContentLength(file.getFile().length);
        response.setHeader("Content-Disposition","attachment; filename=\"" + file.getName() +"\"");
 
        System.out.println("----file----");
		FileCopyUtils.copy(file.getFile(), response.getOutputStream());
		
		return  getAllFiles();
	}
}


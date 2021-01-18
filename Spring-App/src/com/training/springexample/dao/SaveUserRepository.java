package com.training.springexample.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import com.training.springexample.model.MyFile;
import com.training.springexample.model.User;

@Repository
public class SaveUserRepository {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public void saveUserToDataBase(User user) {

		// we need to connect to DB
		// jdbcTemplate
		// datasource properties

		// JdbcTemplate.save(user);
			jdbcTemplate.update("Insert into user (userName, passWord) values('" + user.getUserName() + "','" + user.getPassword() + "')");
		// use//ORM Hibernate , JPA
		// jparepo.save(user);
	}
	
	
	public List<User> getAllUsers() {
		//users
		List<User> userList = (List<User>) jdbcTemplate.query("SELECT * FROM user",new UserMapper());
		//SELECT userName,password FROM user -- >
//		logger
		return userList;
//		return  jdbcTemplate.queryForList("SELECT * FROM user", User.class);
	}
	
	//username - >User
	
	public User getUserByUserName(String userName) {
//		jdbcTemplate.query("select userName, password from user where userName = ?", new Object[] {userName}, new UserMapper());
		List<User> users = jdbcTemplate.query("select userName, password from user where userName = '" + userName +"'", new UserMapper());
		if (users != null && users.size() > 0) {
			return users.get(0);
		}
		//throw Error - UserNotFoundException
		return new User();
	}
	
	
	
	public void updateUser(User user) {
		
		// execute update query
//		jdbcTemplate.update("update user set password = ? where userName = ? ",new Object[] {user.getPassword(), user.getUserName() });
		
		jdbcTemplate.update("update user set password = '" + user.getPassword() +  "' where userName = '" + user.getUserName() +"' ");
		
	}


	public void deleteUser(User user) {
		
//		jdbcTemplate.update("delete from user where userName = '" + user.getUserName() +"'");
		
		jdbcTemplate.update("delete from user where userName = ?",new Object[] {user.getUserName()});
		
	}


	public void upload(CommonsMultipartFile file) {
		
		if(file != null) {
			 String filename=file.getOriginalFilename();  
			 jdbcTemplate.update("insert into userdoc ( doc_name , doc_obj) values (?, ? )",new Object[] {filename, file.getBytes()});
		}
		
	}


		
	public void saveFile(CommonsMultipartFile file) {
		if(file != null) {
			String fileName = file.getOriginalFilename();
			jdbcTemplate.update("insert into userdoc ( doc_name , doc_obj) values (?, ? ) ", new Object[] {fileName, file.getBytes()});
		}
	}


	public List<String> getAllFileNames() {

		List<String> allFileNames = jdbcTemplate.queryForList("select doc_name from userdoc",String.class);
		return allFileNames;
	}


	public MyFile downloadFileByName(Integer id) {
		// TODO Auto-generated method stub
	String	query = "select doc_id, doc_name, doc_obj from files where doc_id = ?";
		 try {
	            MyFile file = (MyFile) jdbcTemplate.queryForObject(query, new Object[] {id},
	                new RowMapper() {
	            	MyFile fl;
	                    public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
	                        fl = new MyFile();
	                        fl.setId(rs.getInt(1));
	                        fl.setName(rs.getString(2));
	                        fl.setFile(rs.getBytes(3));
	                        return fl;
	                    }
	            });
	 
	          return file;
		 } catch (Exception ex) {
	            ex.printStackTrace();
	        }
	 
	        return null;
	}


//	CREATE TABLE User ( userName varchar(255) , passWord varchar(255), PRIMARY KEY (userName));
//	CREATE TABLE userdoc (doc_id INT(10)  AUTO_INCREMENT PRIMARY KEY, doc_name  varchar(50), doc_obj LONGBLOB);
	

	/*
	 * public JdbcTemplate getJdbcTemplate() { return jdbcTemplate; }
	 * 
	 * 
	 * public void setJdbcTemplate(JdbcTemplate jdbcTemplate) { this.jdbcTemplate =
	 * jdbcTemplate; }
	 */
	
	
	
}

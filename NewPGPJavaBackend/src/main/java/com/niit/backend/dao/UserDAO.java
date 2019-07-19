package com.niit.backend.dao;


import java.util.List;

import com.niit.backend.model.User;


public interface UserDAO {
	
	public List<User> getUserList();
	
	public boolean createUser(User user);
	
	public User getUserById(int userId);
	
	public boolean updateUser(User user);
	
	public boolean deleteUser(int userId);
	
	public List<User> getUserListByName(String username);
	
	public User authUser(String userId,String password);
	
	public List<User> getUserListBySkill(String skill);

}

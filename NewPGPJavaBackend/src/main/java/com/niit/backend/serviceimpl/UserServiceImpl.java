package com.niit.backend.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.niit.backend.dao.UserDAO;
import com.niit.backend.model.User;
import com.niit.backend.service.UserService;



@Service
public class UserServiceImpl implements UserService{
	@Autowired
	UserDAO userDAO;

	public List<User> getUserList() {		
		return userDAO.getUserList();
	}

	public boolean createUser(User user) {
		userDAO.createUser(user);
		return true;
	}

	public User getUserById(int userId) {
		
		return userDAO.getUserById(userId);
	}

	public boolean updateUser(User user) {
		userDAO.updateUser(user);
		return true;
	}

	public boolean deleteUser(int userId) {
		userDAO.deleteUser(userId);
		return true;
	}

	public List<User> getUserListByName(String username) {
		// TODO Auto-generated method stub
		return userDAO.getUserListByName(username);
	}

	public User authUser(String userId,String password) {
		return userDAO.authUser(userId,password);
	}

	public List<User> getUserListBySkill(String skill) {
		return userDAO.getUserListBySkill(skill);
	}



}

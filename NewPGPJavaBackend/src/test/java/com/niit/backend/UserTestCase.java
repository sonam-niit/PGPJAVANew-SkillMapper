package com.niit.backend;

import static org.junit.Assert.*;

import java.util.List;

import org.jboss.logging.Logger.Level;
import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.test.context.junit4.SpringRunner;

import com.niit.backend.config.AppContext;
import com.niit.backend.daoimpl.UserDAOImpl;
import com.niit.backend.model.User;
import com.niit.backend.service.UserService;




@RunWith(SpringRunner.class)
@SpringJUnitConfig(classes=AppContext.class)
public class UserTestCase {

	@Autowired
	UserService userService;

	@Before
	public void setUp() throws Exception {
			//userService=new UserServiceImpl();
	}

	@After
	public void tearDown() throws Exception {
		userService = null;
	}
	@Ignore
	@Test
	public void userListTest() {

		List<User> getUserList = userService.getUserList();	
		assertEquals(5, getUserList.size());
	}
	@Ignore
	@Test
	public void addUser() {
		User user = new User();
		user.setUsername("John");
		user.setPassword("12345");
		user.setPhone_number("1234567890");
		user.setSkills("java,advancejava");

		assertEquals(true, userService.createUser(user));
	}
	
	@Test
	public void updateUser() {
		User user = userService.getUserById(1);
		user.setPhone_number("9820704323");
		assertEquals(true, userService.updateUser(user));
	}
	
	@Ignore
	@Test
	public void deleteUser() {
		assertEquals(true, userService.deleteUser(1));
	}
}

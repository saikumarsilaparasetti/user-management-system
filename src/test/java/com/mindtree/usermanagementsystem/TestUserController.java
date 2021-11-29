package com.mindtree.usermanagementsystem;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.mindtree.usermanagementsystem.controller.UserController;
import com.mindtree.usermanagementsystem.entity.User;

public class TestUserController {
	
	
	public static UserController controller ;

	
	@BeforeAll
	public static void setup() {
		controller = new UserController();
	}
	
	@AfterAll
	public static void clear() {
		controller = null;
	}
	
	@Test
	void testValidUser() {
		String res = controller.getUserById(1);
		assertTrue(res.length()>0);
	}
	
	@Test
	void testInValidUser() {
		assertFalse(controller.getUserById(5).length()==0);
		
	}
	
	@Test
	void testGetAllUsers() {
		List<User> res = controller.getAllUsers();
		
		assertTrue(res.size()>0);
	}
}

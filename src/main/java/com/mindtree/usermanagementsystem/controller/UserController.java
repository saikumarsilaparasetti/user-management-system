package com.mindtree.usermanagementsystem.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.usermanagementsystem.entity.User;
import com.mindtree.usermanagementsystem.service.UserReposetory;

import jdk.internal.org.jline.utils.Log;

@RestController
public class UserController {
	
	@Autowired
	UserReposetory repo;
	
	
	Logger log = LoggerFactory.getLogger(UserController.class);
	
	@GetMapping("/get/users")
	public List<User> getAllUsers(){
		log.info("All users returned");
		return repo.findAll();
		
	}
	
	@GetMapping("/get/user/id/{id}")
	
	public String getUserById(@PathVariable Integer id) {
		String res ="";
		
		res = repo.getById(id).toString();
		
		log.info(res);
		
		return res;
	}
	
	@PostMapping("/post/users/{name}/{email}/{access}")
	public void addUser(@PathVariable String name, @PathVariable String email, @PathVariable String access) {
		User newUser = new User(name, email, access);
		repo.save(newUser);
		log.info(newUser+" added to db");
		
	}
}

package com.mindtree.usermanagementsystem;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.mindtree.usermanagementsystem.entity.User;
import com.mindtree.usermanagementsystem.service.UserReposetory;

@Component
public class UserCommandLineRunner implements CommandLineRunner{

	Logger log = LoggerFactory.getLogger(UserCommandLineRunner.class);
	
	@Autowired
	UserReposetory repo;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		User u1 = new User("user-1", "user1@gmail.com", "Devices, SaaS");
		User u2 = new User("user-2", "user2@gmail.com", "Devices, SaaS, Devices");
		repo.save(u1);
		log.info(u1+" is added to db");
		repo.save(u2);
		log.info(u2+" is added to db");	
		
	}

}

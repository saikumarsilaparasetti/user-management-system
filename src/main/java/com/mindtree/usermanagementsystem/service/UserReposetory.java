package com.mindtree.usermanagementsystem.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.mindtree.usermanagementsystem.entity.User;
@Component
public interface UserReposetory extends JpaRepository<User, Integer>{

}

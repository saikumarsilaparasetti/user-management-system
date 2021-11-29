package com.mindtree.usermanagementsystem.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class User {
	
	@Id
	@GeneratedValue
	int id;
	String name;
	String email;
	String accessResources;
	
	public User() {
		
	}
	public User(String name, String email, String accessResources) {
		this.name = name;
		this.email = email;
		this.accessResources = accessResources;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAccessResources() {
		return accessResources;
	}
	public void setAccessResources(String accessResources) {
		this.accessResources = accessResources;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", email=" + email + ", accessResources=" + accessResources + "]";
	}
	
	
}

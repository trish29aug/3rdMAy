package com.managedBeans;


import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Component;


@Component
@Entity
public class UserDto {
	@Id
	private String userId;
	
	private String fName;
	
	private String lName;
	
	private String password;
	
	private int age;
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

}

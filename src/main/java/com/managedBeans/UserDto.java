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
	
	public Long getphoneNumber() {
		return phoneNumber;
	}
	public void setphoneNumber(Long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	private Long phoneNumber;
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
	

}

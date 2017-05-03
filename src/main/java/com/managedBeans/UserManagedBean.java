package com.managedBeans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Users")
@SuppressWarnings("serial")
public class UserManagedBean implements Serializable{
		
		@Id
		@Column(name="userId")
		private String userId;
		@Column(name="fName")
		private String fName;
		@Column(name="lName")
		private String lName;
		@Column(name="password")
		private String password;
		@Column(name="age")
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

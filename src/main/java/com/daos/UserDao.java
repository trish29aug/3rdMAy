package com.daos;

import com.beans.UserBean;

public interface UserDao {
	
	public String persistUser(UserBean bean);
	public String checkLogin(String userName, String userPassword);

}

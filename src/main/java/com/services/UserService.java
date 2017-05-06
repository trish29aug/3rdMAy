package com.services;

import com.beans.UserBean;

public interface UserService {

	public String persistUser(UserBean bean);
	public String checkLogin(String userName, String userPassword);
}

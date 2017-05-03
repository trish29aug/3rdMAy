package com.services;

import com.beans.UserBean;

public interface UserService {

	public void persistUser(UserBean bean);
	public boolean checkLogin(String userName, String userPassword);
}

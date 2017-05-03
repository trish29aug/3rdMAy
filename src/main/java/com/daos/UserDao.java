package com.daos;

import com.beans.UserBean;

public interface UserDao {
	
	public void persistUser(UserBean bean);
	public boolean checkLogin(String userName, String userPassword);

}

package com.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.beans.UserBean;
import com.daos.UserDao;


@Service("UserService")
@ComponentScan(basePackages="com.daos")
public class UserServiceImpl implements UserService{
	
	@Autowired
	 private UserDao userDAO;

	   public void setLoginDAO(UserDao userDAO) {
             this.userDAO = userDAO;
      }
     
	
	public String persistUser(UserBean bean){
			System.out.println(bean.getUserId());
			System.out.println(bean.getlName());
			System.out.println(bean.getfName());
			System.out.println(bean.getPassword());
			return userDAO.persistUser(bean);
		
	}
	public String checkLogin(String userName, String userPassword){
		System.out.println("In Service class...Check Login");
        return userDAO.checkLogin(userName, userPassword);
	}

}

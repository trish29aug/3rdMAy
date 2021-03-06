package com.controllers;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.beans.UserBean;
import com.services.UserService;

@Controller
@ComponentScan(basePackages="com.services")
public class AuthController {
	
	@Autowired
	public UserService userService;
	
	@RequestMapping("/login")
	public ModelAndView login(HttpServletRequest request){
		String userName=userService.checkLogin(request.getParameter("userId"),request.getParameter("password"));
	if(userName!=null && userName.length()>0){
		 
		HttpSession session= request.getSession();
		session.setAttribute("user", request.getParameter("userId"));
		session.setAttribute("userName",userName);
		return new ModelAndView("loginSuccess");
		}
	else
		return new ModelAndView("error");
	}
	
	@RequestMapping("/signUp")
	public ModelAndView signUp(HttpServletRequest request){
		
		UserBean usr= new UserBean();
		usr.setUserId(request.getParameter("email"));
		usr.setfName(request.getParameter("fname"));
		usr.setlName(request.getParameter("lname"));
		usr.setPassword(request.getParameter("signUpPassword"));
		usr.setPhoneNumber(Long.parseLong(request.getParameter("phoneNumber")));
		 
		userService.persistUser(usr);
		HttpSession session= request.getSession();
		session.setAttribute("user", request.getParameter("userId"));
		session.setAttribute("userName",request.getParameter("fname"));
		return new ModelAndView("loginSuccess");
	}
	
	@RequestMapping("/logout")
	public ModelAndView logout(HttpServletRequest request){
		HttpSession session= request.getSession();
	if(session != null && session.getAttribute("user")!= null){
		session.setAttribute("user", null);
		
		}
	return new ModelAndView("basePage");
	}
}

package com.daos;


import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.beans.UserBean;
import com.managedBeans.UserDto;
import com.managedBeans.UserManagedBean;

@Repository("userDAO")
public class UserDaoImpl implements UserDao {
	
	@Resource(name="sessionFactory")
    protected SessionFactory sessionFactory;

	@Autowired
	 private UserDto user;
	
    public void setSessionFactory(SessionFactory sessionFactory) {
           this.sessionFactory = sessionFactory;
    }
   
    protected Session getSession(){
           return sessionFactory.openSession();
    }

	public void persistUser(UserBean bean){
		System.out.println("in persist dao");
		try{
		/*UserDto user= new UserDto();*/
		user.setAge(bean.getAge());
		user.setfName(bean.getfName());
		user.setlName(bean.getlName());
		user.setUserId(bean.getUserId());
		user.setPassword(bean.getPassword());
		Configuration cfg=new Configuration();  
	    cfg.configure("hibernate.cfg.xml");//populates the data of the configuration file  
	      
	    //creating seession factory object  
	    ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(
	    		cfg.getProperties()). buildServiceRegistry();
		SessionFactory factory=cfg.buildSessionFactory(serviceRegistry);  
	      
	    //creating session object  
	    Session session=factory.openSession();  
	      
	    //creating transaction object  
	    Transaction t=session.beginTransaction();  
	    session.save(user);//persisting the object  
	      
	    session.getTransaction().commit();//transaction is commited  
	    session.close();  
	      
	    System.out.println("successfully saved"); 
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("error");
			e.printStackTrace();
		}
		
	}
	public boolean checkLogin(String userId, String userPassword){
		System.out.println("In Check login");
		boolean userFound = false;
		//Query using Hibernate Query Language
		/*String SQL_QUERY =" from Users as o where o.userId=? and o.password=?";
		Query query = session.createQuery(SQL_QUERY);
		query.setParameter(0,userId);
		query.setParameter(1,userPassword);*/
		Configuration cfg=new Configuration();  
	    cfg.configure("hibernate.cfg.xml");//populates the data of the configuration file  
	      
	    //creating seession factory object  
	    ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(
	    		cfg.getProperties()). buildServiceRegistry();
		SessionFactory factory=cfg.buildSessionFactory(serviceRegistry);  
	      
	    //creating session object  
	    Session session=factory.openSession();  
	      
	    //creating transaction object  
	    Transaction t=session.beginTransaction();
		String SQL_QUERY ="from UserDto where userId=?";
		Query query = session.createQuery(SQL_QUERY);
		query.setParameter(0,userId);
		List list = query.list();

		if ((list != null) && (list.size() > 0)) {
			userFound= true;
		}

		session.close();
		return userFound;              
   }
}

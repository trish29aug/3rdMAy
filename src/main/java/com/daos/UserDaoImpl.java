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

	public String persistUser(UserBean bean){
		System.out.println("in persist dao");
		try{
		/*UserDto user= new UserDto();*/
		user.setphoneNumber(bean.getPhoneNumber());
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
	    return user.getfName()+" "+user.getlName();
	     
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("error");
			e.printStackTrace();
			return null;
		}
		
	}
	public String checkLogin(String userId, String userPassword){
		System.out.println("In Check login");
		
		String userName=null;
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
		String SQL_QUERY ="select fName,lName from UserDto where userId=?";
		Query query = session.createQuery(SQL_QUERY);
		query.setParameter(0,userId);

		List<Object[]> rows = query.list();

		if ((rows!= null) && (rows.size()== 1)) {
			for (Object[] row : rows) {
				userName= row[0]+" "+row[1];
			}
		}

		session.close();
		return userName;              
   }
}

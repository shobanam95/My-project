package com.urwardrobe.dao;



import org.hibernate.Session;


import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.urwardrobe.model.UserForm;

@Repository
public class UserDaoimpl  implements UserDao {
public SessionFactory getSessionfactory() {
		return sessionfactory;
	}
	public void setSessionfactory(SessionFactory sessionfactory) {
		this.sessionfactory = sessionfactory;
	}
@Autowired
	private SessionFactory sessionfactory;

@Transactional


public void save(UserForm user) {
	
	
	Session session = this.sessionfactory.getCurrentSession();
	
		
	  session.save(user);
	  System.out.println("Inserted Successfully");
	 
	
	
	  
	 }
	
@Transactional


public void update(UserForm user) {
	
	
	Session session = this.sessionfactory.getCurrentSession();
			  session.update(user);
	  System.out.println("Updated Successfully");
	 	
	
	  
	 }

/*
@Transactional
public void update(UserForm user){

Session session = this.sessionfactory.getCurrentSession();


Transaction tx1 = session.beginTransaction();           
Object obj4 = session.load(UserForm.class, new Integer(1));  	// 103 record exists
UserForm u2 = (UserForm) obj4;

u2.setConfirm_password("qwert");
u2.setEmail("shobi@xyz");
u2.setFirstname("Shobi");
u2.setLastname("Papu");
u2.setPassword("qwert");
u2.setId(2);
session.update(u1);
System.out.println("2");
tx1.commit();  
System.out.println("103 record is updated");


}
*/
	
@Transactional
public void delete(UserForm user) {
	Session session = this.sessionfactory.getCurrentSession();
	UserForm u2 = (UserForm) session.load(UserForm.class,1);
	if(null!= u2){
		session.delete(user);
		
		
	}
	System.out.println("deleted"+ user);
}




	// TODO Auto-generated method stub
	
}







package com.urwardrobeappquick.urwardrobebackend;

import org.hibernate.Session;


import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import org.springframework.context.annotation.Bean;

import com.urwardrobe.dao.DaoService;
import com.urwardrobe.dao.UserDao;
import com.urwardrobe.model.Product;
import com.urwardrobe.model.UserForm;
import com.urwardrobe.service.Userimplservice;




public class App 
{
	
	
	

	public static void main(String args[])
	{
	
		System.out.println("one");
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		System.out.println("one");
		
		context.scan("com.urwardrobe.confiig");
		context.refresh();
		/*
		UserDao userbean = (UserDao)context.getBean("userbean");
		System.out.println("one");	
		*/   
			DaoService prdtbean = (DaoService)context.getBean("prdtbean");
	
		
		
	/*	
		    
		UserForm  user = new UserForm ();
			       user.setConfirm_password("1234");
			        user.setEmail("shobi@1234");
			        user.setFirstname("Shobana");
			        user.setLastname("M");
			        user.setPassword("1234");
			        user.setId(1);
			        System.out.println("2");	 
			        userbean.save(user);
			      
			        
			        UserForm  u2 = new UserForm ();  
			        u2.setPassword("tttt");
			        System.out.println(u2);
			        userbean.update(u2); 
			        
				        
			         userbean.delete(u2);
			        System.out.println(u2);

*/
			        
	      
		Product prdt = new Product();
		prdt.setProduct_Name("Kurtis");
		prdt.setCategory("Women");
		prdt.setProduct_Id(2);
		prdt.setProduct_Description("Size:xl");
		prdt.setProduct_Price(1000);
		 System.out.println("2");
		prdtbean.save(prdt);
		
		
		
	}
}
	
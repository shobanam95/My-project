package com.urwardrobe.dao;


import java.util.List;


import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;


import com.urwardrobe.model.Product;
import com.urwardrobe.service.ProductDaoService;

@Repository

public class Daoimpl  implements DaoService {
	public SessionFactory getSessionfactory() {
		return sessionfactory;
	}
	public void setSessionfactory(SessionFactory sessionfactory) {
		this.sessionfactory = sessionfactory;
	}
@Autowired
	private SessionFactory sessionfactory;
	
	
	@Transactional
	
	public void save(Product prdt) {
		Session session = this.sessionfactory.getCurrentSession();
			 session.save(prdt);
		  System.out.println("Inserted Successfully");
		 session.flush();
			  
		 }
		
@Transactional
	public void update(Product prdt) {
		Session session = this.sessionfactory.getCurrentSession();
		
		
		  session.update(prdt);
		  System.out.println("Updated Successfully");
		  session.close();
			  
		 }	
		
@Transactional
	public void delete(Product prdt) {
		Session session = this.sessionfactory.getCurrentSession();
		
		
		  session.delete(prdt);
		  System.out.println("Inserted Successfully");
		  session.close();
			
		  
		 }
public List<Product> listProduct() {
	Session session = this.sessionfactory.getCurrentSession();
	  List<Product> list = session.createCriteria(Product.class).list();
	return list;
	
}
public Product getProduct(int product_Id) {
	Session session = this.sessionfactory.getCurrentSession();
	session.get(Product.class,product_Id);
	return null;
}


		
		
	}

	

	


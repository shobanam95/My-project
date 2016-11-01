package com.urwardrobe.dao;


import java.util.List;

import javax.persistence.Query;
import javax.persistence.criteria.From;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.annotations.Fetch;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;


import com.urwardrobe.model.Product;
import com.urwardrobe.service.ProductDaoService;

@Repository

public class Daoimpl  implements DaoService {
	private static final String Fetch = null;


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
		
		   
		 }
		
@Transactional
	public void update(Product prdt) {
		Session session = this.sessionfactory.getCurrentSession();
		
		
		  session.update(prdt);
		  session.clear();
		  System.out.println("Updated Successfully");
		  
			  
		 }	
		
@Transactional
	public void delete(Product prdt) {
		Session session = this.sessionfactory.getCurrentSession();
		
		
		  session.delete(prdt);
		  System.out.println("Inserted Successfully");
		  
			
		  
		 }
@SuppressWarnings("unchecked")
@Transactional
public List<Product> listProduct() {
	Session session = sessionfactory.openSession();
	
	List<Product> prdtlist = session.createQuery("from Products" ).list();
	Query query = (Query) session.createQuery("from Products");
    query.executeUpdate();
    
	
	return prdtlist;


	
	
}
public Product getProduct(int product_Id) {
	Session session = this.sessionfactory.getCurrentSession();
	session.get(Product.class,product_Id);
	return null;
}


		
		
	}

	

	


package com.urwardrobe.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.urwardrobe.dao.DaoService;
import com.urwardrobe.model.Product;
 

@Service



public class ProductImpl implements ProductDaoService {

@Autowired
	 private DaoService daoservice;

public DaoService getDaoservice() {
	return daoservice;
}

public void setDaoservice(DaoService daoservice) {
	this.daoservice = daoservice;
}

public void save(Product prdt) {
	daoservice.save(prdt);
	
}

public void update(Product prdt) {
	daoservice.update(prdt);
	
}

public void delete(Product prdt) {

	daoservice.delete(prdt);
}


public Product  getProduct(int product_Id) {
	
	return daoservice.getProduct( product_Id);
	
}

public List<Product> listProduct() {
	return daoservice.listProduct();
}




	 
		
	}
	

	

	
	
     


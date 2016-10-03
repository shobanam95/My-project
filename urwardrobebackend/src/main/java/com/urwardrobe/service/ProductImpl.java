package com.urwardrobe.service;

import java.util.ArrayList;
import java.util.List;
import com.urwardrobe.model.Product;

public class ProductImpl implements ProductService {

	public List<Product> getAllProducts() {
		
		List<Product> products=new ArrayList<Product>();
		
		Product prdt = new Product();
		prdt.setProduct_Name("cloth");
		prdt.setProduct_Description("cloth is good");
		prdt.setProduct_Price(1000);
		products.add(prdt);
		
		return products;
		
	}

}

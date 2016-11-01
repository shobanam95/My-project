package com.urwardrobe.model;

import java.io.Serializable;



import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="Products")
public class Product implements Serializable{
	private String Product_Name;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int Product_Id;
	private String Product_Description;
    private int Product_Price;
    private String Category;

    
    
    public String getProduct_Name() {
		return Product_Name;
	}
	public void setProduct_Name(String product_Name) {
		Product_Name = product_Name;
	}
	
	public int getProduct_Id() {
		return Product_Id;
	}
	public void setProduct_Id(int product_Id) {
		Product_Id = product_Id;
		
	}
	public String getProduct_Description() {
		return Product_Description;
	}
	public void setProduct_Description(String product_Description) {
		Product_Description = product_Description;
	}
	
	public int getProduct_Price() {
		return Product_Price;
	}
	public void setProduct_Price(int product_Price) {
		Product_Price = product_Price;
	}
	public String getCategory() {
		return Category;
	}
	public void setCategory(String category) {
		Category = category;
	}

	  @Override
	    public String toString() {
	        return "Product[name=" + Product_Name
	                + ", Price=" + Product_Price + ",Description "+ Product_Description+",]";
	    }
	

}

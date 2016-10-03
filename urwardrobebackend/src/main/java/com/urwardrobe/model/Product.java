package com.urwardrobe.model;

import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Product {
	private String Product_Name;
	@Id
	private String Product_Id;
	private String Product_Description;
    private int Product_Price;
    private int Category;
    public String getProduct_Name() {
		return Product_Name;
	}
	public void setProduct_Name(String product_Name) {
		Product_Name = product_Name;
	}
	public String getProduct_Id() {
		return Product_Id;
	}
	public void setProduct_Id(String product_Id) {
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
	public int getCategory() {
		return Category;
	}
	public void setCategory(int category) {
		Category = category;
	}

   

}

package com.example.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ProductInfo {
	
	@Id
	@GeneratedValue(strategy= GenerationType.SEQUENCE)
	private int productId;	
	private String productName;
	private String productOwner;
	private double productValue;
	

	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductOwner() {
		return productOwner;
	}
	public void setProductOwner(String productOwner) {
		this.productOwner = productOwner;
	}
	public double getProductValue() {
		return productValue;
	}
	public void setProductValue(double productValue) {
		this.productValue = productValue;
	}
	
	

}

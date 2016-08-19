package com.example.dao;

import java.util.List;

import com.example.model.ProductInfo;

public interface ProductDao {
	
	void addProduct(ProductInfo product);
	
	List<ProductInfo> getAllProducts();
	
	ProductInfo getSingleProduct(int id);
	

}

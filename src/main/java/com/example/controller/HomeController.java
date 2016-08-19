package com.example.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.dao.ProductDao;
import com.example.model.ProductInfo;

@Controller
public class HomeController {
	
	@Autowired
	ProductDao productDao;
	
	@RequestMapping("/")
	public String printMethod(){
		return "home";
	}
	@RequestMapping("/productList")
	public String getProductList(Model model){
		
		List<ProductInfo> product1 = productDao.getAllProducts();	
		
		model.addAttribute("p1",	product1);	
		return "productInfo";
		
	}
	
	@RequestMapping("/singleProductInfo/{productId}")
	public String getproductInfo(@PathVariable int productId, Model model){
		
		ProductInfo product = productDao.getSingleProduct(productId);
		model.addAttribute("singleProduct", product);
		return("singleProductInfo");
		
	}

}

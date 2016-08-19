package com.example.dao.Impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.dao.ProductDao;
import com.example.model.ProductInfo;

@Repository
@Transactional
public class ProductDaoImpl implements ProductDao{
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void addProduct(ProductInfo product) {
		// TODO Auto-generated method stub
		
		Session sessionObject = sessionFactory.getCurrentSession();
		sessionObject.saveOrUpdate(product);	
		sessionObject.flush();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<ProductInfo> getAllProducts() {
		// TODO Auto-generated method stub
		Session sessionObject = sessionFactory.getCurrentSession();
		Query query = sessionObject.createQuery("from ProductInfo");
		List<ProductInfo> product = query.getResultList();
		return product;
	}

	@Override
	public ProductInfo getSingleProduct(int id) {
		// TODO Auto-generated method stub
		Session sessionObject = sessionFactory.getCurrentSession();
		ProductInfo product = (ProductInfo)sessionObject.get(ProductInfo.class, id);
		return product;
	}

}

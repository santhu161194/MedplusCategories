package com.medplus.categories.dao;

import org.springframework.stereotype.Component;

import com.medplus.categories.beans.ProductModel;

@Component
public interface ProductDao {

	public int createProduct(ProductModel product);
	public void updateProduct();
	public void deleteProduct();
	
	
}

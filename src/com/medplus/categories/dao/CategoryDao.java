package com.medplus.categories.dao;

import org.springframework.stereotype.Component;

import com.medplus.categories.beans.CategoryModel;
import com.medplus.categories.beans.ProductModel;
@Component
public interface CategoryDao {
	public int createCategory(CategoryModel category);
	public int updateCategory();
	public int deleteCategory();
	public int addProductToCategory(ProductModel product);
	public int moveProductFromCategory();
}

package com.medplus.categories.beans;

import java.util.ArrayList;

import org.springframework.stereotype.Component;
@Component
public class CategoryModel {
private String categoryId;
private String categoryName;
private ArrayList<CategoryModel> listOfCategories;
private ArrayList<ProductModel> listOfProducts;
private int numberOfSubCategories;
private int numberOfProducts;



public int getNumberOfSubCategories() {
	return numberOfSubCategories;
}
public void setNumberOfSubCategories(int numberOfSubCategories) {
	this.numberOfSubCategories = numberOfSubCategories;
}
public int getNumberOfProducts() {
	return numberOfProducts;
}
public void setNumberOfProducts(int numberOfProducts) {
	this.numberOfProducts = numberOfProducts;
}
public String getCategoryId() {
	return categoryId;
}
public void setCategoryId(String categoryId) {
	this.categoryId = categoryId;
}
public String getCategoryName() {
	return categoryName;
}
public void setCategoryName(String categoryName) {
	this.categoryName = categoryName;
}
public ArrayList<CategoryModel> getListOfCategories() {
	return listOfCategories;
}
public void setListOfCategories(ArrayList<CategoryModel> listOfCategories) {
	this.listOfCategories = listOfCategories;
}
public ArrayList<ProductModel> getListOfProducts() {
	return listOfProducts;
}
public void setListOfProducts(ArrayList<ProductModel> listOfProducts) {
	this.listOfProducts = listOfProducts;
}



}

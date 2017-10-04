package com.medplus.categories.beans;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;
@Component
public class ProductModel {
private String productId;
private String productName;
private String manufacturer;
@DateTimeFormat(style="dd/MM/yyyy")
private Date dateOfExpiry;
private double price;
private String categoryId;



public String getCategoryId() {
	return categoryId;
}
public void setCategoryId(String categoryId) {
	this.categoryId = categoryId;
}
public String getProductId() {
	return productId;
}
public void setProductId(String productId) {
	this.productId = productId;
}
public String getProductName() {
	return productName;
}
public void setProductName(String productName) {
	this.productName = productName;
}
public String getManufacturer() {
	return manufacturer;
}
public void setManufacturer(String manufacturer) {
	this.manufacturer = manufacturer;
}


public Date getDateOfExpiry() {
	return dateOfExpiry;
}
public void setDateOfExpiry(Date dateOfExpiry) {
	this.dateOfExpiry = dateOfExpiry;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}



}

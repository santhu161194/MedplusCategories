package com.medplus.categories.beans;

import java.util.ArrayList;

import org.springframework.stereotype.Component;
@Component
public class CatalogueModel {
private ArrayList<ProductModel> productCatalogue;


public ArrayList<ProductModel> getProductCatalogue() {
	return productCatalogue;
}

public void setProductCatalogue(ArrayList<ProductModel> productCatalogue) {
	this.productCatalogue = productCatalogue;
}



}

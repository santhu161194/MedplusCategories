package com.medplus.categories.dao.impl;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.stereotype.Component;

import com.medplus.categories.beans.ProductModel;
import com.medplus.categories.dao.ProductDao;
import com.medplus.categories.utils.Queries;

@Component


public class ProductDaoImpl implements ProductDao{
	int rows=0;
	@Autowired
	JdbcTemplate template;
	
	@Autowired
	ProductModel product;
	@Override
	public int createProduct(final ProductModel product) {
		String sql=Queries.addProduct;
		
		
		int rows;
		rows=template.update(sql, new PreparedStatementSetter() {
			
			@Override
			public void setValues(PreparedStatement pst) throws SQLException {
				//java.sql.Date sqldate=new java.sql.Date(date.getTime());
				pst.setString(1, product.getProductId());
				pst.setString(2, product.getProductName());
				pst.setString(3, product.getManufacturer());
				pst.setDate(4, new java.sql.Date(product.getDateOfExpiry().getTime()));
				pst.setDouble(5, product.getPrice());
			}
		});
		

		return rows;
}

	@Override
	public void updateProduct() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteProduct() {
		// TODO Auto-generated method stub
		
	}

}

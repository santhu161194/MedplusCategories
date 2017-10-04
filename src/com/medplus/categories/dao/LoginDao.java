package com.medplus.categories.dao;

import org.springframework.stereotype.Component;

import com.medplus.categories.beans.Login;


@Component
public interface LoginDao {

	
	public int addLogin(final String userid,final String password,final String role);
	public Login Validate(String username,String password) ;

}

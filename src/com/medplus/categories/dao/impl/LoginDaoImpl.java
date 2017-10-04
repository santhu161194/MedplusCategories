package com.medplus.categories.dao.impl;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.stereotype.Component;

import com.medplus.categories.beans.Login;
import com.medplus.categories.dao.LoginDao;
import com.medplus.categories.utils.Queries;


@Component
public class LoginDaoImpl implements LoginDao{
	@Autowired
	JdbcTemplate template;
	public int addLogin(final String username,final String password,final String role)
	{
		String sql=Queries.createUserLogin;
		int rows;
		rows=template.update(sql, new PreparedStatementSetter() {
			@Override
			public void setValues(PreparedStatement pst) throws SQLException {
				pst.setString(1, username);
				pst.setString(2, password);
				pst.setString(3, role);
		}
		
	});
		return rows;
}
	@Override
	public Login Validate(String userid,String password) {
		String sql="select * from Login where username=?";
		Object args[]={userid};
		Login login=null;
		try{
		login=template.queryForObject(sql, args, new BeanPropertyRowMapper<Login>(Login.class));
		if(password.equals(login.getPassword()))
		return login;
		else
		return null;
		}
		catch(EmptyResultDataAccessException e)
		{
			System.out.println("No record found");
			return null;
		}
		
		}
	
	}
	


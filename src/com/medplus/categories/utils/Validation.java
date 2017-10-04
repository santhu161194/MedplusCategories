package com.medplus.categories.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.medplus.categories.beans.Login;

@Component
public class Validation implements Validator{
@Autowired
	Login login;
	@Override
	public boolean supports(Class<?> arg0) {
		
		return Login.class.isAssignableFrom(arg0);
	}

	@Override
	public void validate(Object arg0, Errors arg1) {

		login=(Login) arg0;
/*		if(login.getId()>100||emp.getId()<0)
			arg1.rejectValue("id", "id.err");
		if(emp.getSalary()<=0)
			arg1.rejectValue("salary", "salary.err");*/
		ValidationUtils.rejectIfEmptyOrWhitespace(arg1, "username", "userid.err");
		ValidationUtils.rejectIfEmptyOrWhitespace(arg1, "password", "pass.err");
	}

}

/*package com.medplus.categories.utils;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.medplus.task2.beans.Employee;


@Component
public class Validation2 implements Validator{

	@Override
	public boolean supports(Class<?> arg0) {
		
		return Employee.class.isAssignableFrom(arg0);
	}

	@Override
	public void validate(Object arg0, Errors arg1) {
		Employee emp=(Employee) arg0;
		if(Integer.parseInt(emp.getCode())>100||Integer.parseInt(emp.getCode())<0)
			arg1.rejectValue("code", "userid.err");
		if(emp.getSalary()<=0)
			arg1.rejectValue("salary", "salary.err");
		ValidationUtils.rejectIfEmptyOrWhitespace(arg1, "code", "name.err");
		ValidationUtils.rejectIfEmptyOrWhitespace(arg1, "fname", "fname.err");
		ValidationUtils.rejectIfEmptyOrWhitespace(arg1, "lname", "lname.err");
		ValidationUtils.rejectIfEmptyOrWhitespace(arg1, "job", "job.err");
		ValidationUtils.rejectIfEmptyOrWhitespace(arg1, "salary", "salary.err");
		ValidationUtils.rejectIfEmptyOrWhitespace(arg1, "deptno", "deptno.err");
	}

}
*/
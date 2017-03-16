package com.ian.springmvc.controller;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.ian.springmvc.model.User;

public class UserValidator implements Validator{

	public boolean supports(Class<?> clazz) {
		return User.class.equals(clazz);
	}

	public void validate(Object object, Errors errors) {
		ValidationUtils.rejectIfEmpty(errors, "loginname", null, "登录名不能为空");
		ValidationUtils.rejectIfEmpty(errors, "password", null, "密码不能为空");
		ValidationUtils.rejectIfEmpty(errors, "username", null, "姓名不能为空");
	}

	
}

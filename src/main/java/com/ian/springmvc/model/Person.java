package com.ian.springmvc.model;

import java.util.Date;

public class Person {

	private String loginname;
	private Date birthday;
	
	public Person(){}
	
	public String getLoginname() {
		return loginname;
	}
	public void setLoginname(String loginname) {
		this.loginname = loginname;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	
	
}

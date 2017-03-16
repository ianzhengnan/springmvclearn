package com.ian.springmvc.model;

import java.io.Serializable;

public class User implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3516257286900725428L;

	private String loginname;
	private String username;
	private String password;
		
	public User() {
		super();
	}
	public User(String loginname, String username, String password) {
		super();
		this.loginname = loginname;
		this.username = username;
		this.password = password;
	}
	public String getLoginname() {
		return loginname;
	}
	public void setLoginname(String loginname) {
		this.loginname = loginname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
}

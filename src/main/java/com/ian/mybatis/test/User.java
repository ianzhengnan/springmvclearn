package com.ian.mybatis.test;

import java.io.Serializable;

public class User implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4507731314851728014L;
	
	private Integer id;
	private String name;
	private String sex;
	private Integer age;
	
	public User(){
		
	}
	
	public User(String name, String sex, Integer age) {
		super();
		this.name = name;
		this.sex = sex;
		this.age = age;
	}



	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
	
	@Override
	public String toString(){
		return "User [id = " + id + ", name = " + name + ", sex = " + sex + ", age = " + age + "]";
	}
}

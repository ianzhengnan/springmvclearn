package com.ian.mybatis.mapper;

import java.util.List;

import com.ian.mybatis.test.User;

public interface UserMapper2 {
	
	User selectUserById(Integer id);
	List<User> selectAll();
	void deleteUserById(Integer id);
}

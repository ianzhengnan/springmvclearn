package com.ian.mybatis.test;

import org.apache.ibatis.session.SqlSession;

import com.ian.mybatis.mapper.UserMapper2;

public class TestTwoLevelCache {

	public static void main(String[] args) throws Exception{
		TestTwoLevelCache t = new TestTwoLevelCache();
		t.testCache1();
	}
	
	private void testCache1(){
		SqlSession session = FKSqlSessionFactory.getSqlSession();
		UserMapper2 um = session.getMapper(UserMapper2.class);
		User user = um.selectUserById(1);
		System.out.println(user);
		um.deleteUserById(4);
		session.commit();
		User user2 = um.selectUserById(1);
		System.out.println(user2);
		session.close();
	}
}

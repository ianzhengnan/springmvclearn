package com.ian.mybatis.test;

import org.apache.ibatis.session.SqlSession;

import com.ian.mybatis.mapper.UserMapper2;

public class TestOneLevelCache {
	public static void main(String[] args) throws Exception{
		TestOneLevelCache t = new TestOneLevelCache();
//		t.testCache1();
		t.testCache2();
	}
	private void testCache1(){
		SqlSession session = FKSqlSessionFactory.getSqlSession();
		UserMapper2 um = session.getMapper(UserMapper2.class);
		User user = um.selectUserById(1);
		System.out.println(user);
		//这里会直接从一级缓存里得到数据
		User user2 = um.selectUserById(1);
		System.out.println(user2);;
		session.close();
	}
	
	private void testCache2(){
		SqlSession session = FKSqlSessionFactory.getSqlSession();
		UserMapper2 um = session.getMapper(UserMapper2.class);
		User user = um.selectUserById(1);
		System.out.println(user);
		//清空了一级缓存
		um.deleteUserById(3);
		session.commit();
		//所以这里会重新去数据库表里读取数据
		User user2 = um.selectUserById(1);
		System.out.println(user2);
		session.close();
	}
}

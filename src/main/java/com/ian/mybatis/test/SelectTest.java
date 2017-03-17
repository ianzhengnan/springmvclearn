package com.ian.mybatis.test;

import org.apache.ibatis.session.SqlSession;

public class SelectTest {

	public static void main(String[] args) throws Exception{
		
		SqlSession session = FKSqlSessionFactory.getSqlSession();
		
		User user = session.selectOne("com.ian.mybatis.mapper.UserMapper.selectUser", 1);
		System.out.println(user);
		session.commit();
		session.close();
	}
}

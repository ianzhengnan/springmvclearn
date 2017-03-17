package com.ian.mybatis.test;

import org.apache.ibatis.session.SqlSession;

public class UpdateTest {

	public static void main(String[] args) {
		
		SqlSession session = FKSqlSessionFactory.getSqlSession();
		
		User user = session.selectOne("com.ian.mybatis.mapper.UserMapper.selectUser", 1);
		user.setName("卡卡");
		session.update("com.ian.mybatis.mapper.UserMapper.modifyUser", user);
		session.commit();
		session.close();
	}
}

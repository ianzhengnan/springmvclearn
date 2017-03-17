package com.ian.mybatis.test;

import org.apache.ibatis.session.SqlSession;

public class DeleteTest {

	public static void main(String[] args) {
		SqlSession session = FKSqlSessionFactory.getSqlSession();
		session.delete("com.ian.mybatis.mapper.UserMapper.removeUser", 1);
		session.commit();
		session.close();
	}
}

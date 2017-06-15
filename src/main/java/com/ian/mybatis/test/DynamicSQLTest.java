package com.ian.mybatis.test;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.ian.mybatis.domain.Employee;
import com.ian.mybatis.mapper.EmployeeMapper;

public class DynamicSQLTest {

	public static void main(String[] args) throws Exception{
		InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		SqlSession session = sqlSessionFactory.openSession();
		DynamicSQLTest dTest = new DynamicSQLTest();
		dTest.testSelectEmployeeByIdLike(session);
		dTest.testUpdateEmployeeIfNecessary(session);
		dTest.testSelectEmployeeIn(session);
		dTest.testSelectEmployeeLikeName(session);
		session.commit();
		session.close();
	}
	
	private void testSelectEmployeeByIdLike(SqlSession session){
		EmployeeMapper em = session.getMapper(EmployeeMapper.class);
		HashMap<String, Object> params = new HashMap<String, Object>();
//		params.put("id", 1);
		params.put("state", "INACTIVE");
//		params.put("password", "123456");
//		params.put("loginname", "alice");
		List<Employee> list = em.selectEmployeeByIdLike(params);
		if (list.isEmpty()) {
			System.out.println("没有记录!");
			return;
		}
		list.forEach(employee -> System.out.println(employee));
	}
	
	private void testUpdateEmployeeIfNecessary(SqlSession session){
		EmployeeMapper em = session.getMapper(EmployeeMapper.class);
		Employee employee = em.selectEmployeeById(1);
		employee.setLoginname("flks");
		employee.setPassword("1234567");
		employee.setSal(100000.0);
		em.updateEmployeeIfNecessary(employee);
	}
	
	private void testSelectEmployeeIn(SqlSession session){
		EmployeeMapper em = session.getMapper(EmployeeMapper.class);
		List<Integer> ids = new ArrayList<>();
		ids.add(1);
		ids.add(2);
		List<Employee> list = em.selectEmployeeIn(ids);
		list.forEach(employee -> System.out.println(employee));
	}
	
	private void testSelectEmployeeLikeName(SqlSession session){
		EmployeeMapper em = session.getMapper(EmployeeMapper.class);
		Employee employee = new Employee();
		employee.setName("o");
		List<Employee> list = em.selectEmployeeLikeName(employee);
		System.out.println(list);
	}
}

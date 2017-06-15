package com.ian.mybatis.mapper;

import java.util.HashMap;
import java.util.List;

import com.ian.mybatis.domain.Employee;

public interface EmployeeMapper {

	List<Employee> selectEmployeeByIdLike(HashMap<String, Object> params);
	
	void updateEmployeeIfNecessary(Employee employee);
	
	Employee selectEmployeeById(Integer id);
	
	List<Employee> selectEmployeeIn(List<Integer> ids);
	
	List<Employee> selectEmployeeLikeName(Employee employee);
}

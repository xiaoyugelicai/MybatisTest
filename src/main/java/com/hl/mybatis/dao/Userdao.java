package com.hl.mybatis.dao;

import java.util.List;

import com.hl.mybatis.annotation.MybatisAnnotation;
import com.hl.mybatis.dto.Depart;
import com.hl.mybatis.dto.Emp;
import com.hl.mybatis.dto.User;
import com.hl.mybatis.dto.User2;

//@MybatisAnnotation
public interface Userdao {
	
	// basic CRUD
	List<User> findAll();	
	User findById(String id);
	int updateById(User user);
	void add(User user);
	int deleteById(String id);
	
	// mybatis dynamic sql
	List<User> findById2(User user);
	int updateById2(User user);
	int deleteById2(User user);
	
	// test foreach element
	List<User> findAll2(User user);
	
	// test resultMap 
	List<User2> findAll3();
	
	// test primary key mapping of database supported auto increment. e.g. mysql/sqlserver
	void addEmp(Emp emp);
	
	
	// retrieve emp information and employee's department information
	// test association mapping, nested query, one to one
	Emp findEmpById(int id);
	
	// test association mapping, nested result, one to one
	Emp findEmpById2(int id);
	
	
	// retrieve department information and retrieve department all employees information
	// test collection mapping, nested result, one to many
	Depart findDepartById2(String departno);
	
	// test collection mapping, nested query, one to many
	Depart findDepartById4(String departno);
	
	
	// Note: one to one and many to one very similar
	// retrieve employee information and employee's department information by depart in demo2.test_emp
	// test association mapping, nested result, many to one
	List<Emp> retrieveEmpAndDepartInfo(String depart);
	
	
}

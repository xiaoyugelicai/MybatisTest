package com.hl.mybatis.dto;

import java.util.List;

public class User {
	private String username;
	private String userid;
	private Integer age;
	private List<String> usersid;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "User [username=" + username + ", userid=" + userid + ", age=" + age + "]";
	}

	public User(String username, String userid, Integer age) {
		super();
		this.username = username;
		this.userid = userid;
		this.age = age;
	}

	public User() {
		super();
	}

	public List<String> getUsersid() {
		return usersid;
	}

	public void setUsersid(List<String> usersid) {
		this.usersid = usersid;
	}
	
	
	
	
}

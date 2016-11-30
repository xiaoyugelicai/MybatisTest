package com.hl.mybatis.dto;

public class User2 {
	private String username;
	private String userid;
	private Integer age;
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
		return "User2 [username=" + username + ", userid=" + userid + ", age=" + age + "]";
	}
	
	
}

package com.hl.mybatis.dto;

import java.util.Date;

/**
 * @author hualei
 *
 */
public class Emp {
	
	private String name;
	private Integer age;
	private Date hiredate;
	private String depart;
	private Integer empno;
	
	// associated field
	private Depart dept;
	
	public Depart getDept() {
		return dept;
	}
	public void setDept(Depart dept) {
		this.dept = dept;
	}
	public Integer getEmpno() {
		return empno;
	}
	public void setEmpno(Integer empno) {
		this.empno = empno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Date getHiredate() {
		return hiredate;
	}
	public void setHiredate(Date hiredate) {
		this.hiredate = hiredate;
	}
	public String getDepart() {
		return depart;
	}
	public void setDepart(String depart) {
		this.depart = depart;
	}
	@Override
	public String toString() {
		return "Emp [name=" + name + ", age=" + age + ", hiredate=" + hiredate + ", depart=" + depart + ", empno="
				+ empno + ", dept=" + dept + "]";
	}
	
	
	
	
	
}

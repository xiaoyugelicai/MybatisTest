package com.hl.mybatis.dto;

import java.util.List;

public class Depart {
	
	private String departno;
	private String departname;
	
	// collection emp information field
	private List<Emp> emps;
	
	public List<Emp> getEmps() {
		return emps;
	}
	public void setEmps(List<Emp> emps) {
		this.emps = emps;
	}
	public String getDepartno() {
		return departno;
	}
	public void setDepartno(String departno) {
		this.departno = departno;
	}
	public String getDepartname() {
		return departname;
	}
	public void setDepartname(String departname) {
		this.departname = departname;
	}
	public String toString() {
		return "Depart [departno=" + departno + ", departname=" + departname + ", emps=" + emps + "]";
	}
	
	
	
}

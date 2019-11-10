package com.cns.beans;

import java.util.Date;

public class Department {
	
	private Integer deptNo;
	private String name;
	private Date dop;
	
	
	
	public Department(Integer deptNo,String name,Date dop) {
		this.deptNo=deptNo;
		this.name=name;
		this.dop=dop;
	}


	@Override
	public String toString() {
		return "Department [deptNo=" + deptNo + ", name=" + name + ", dop=" + dop + "]";
	}

	
}

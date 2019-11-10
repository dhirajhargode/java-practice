package com.cns.beans;

public class Employee {
	private Integer eId;
	private String eName;
	private Department deptm;
	
	
	public Employee(Integer eId,String eName,Department deptm) {
		this.eId=eId;
		this.eName=eName;
		this.deptm=deptm;

	}
	
	@Override
	public String toString() {
		return "Employee [eId=" + eId + ", eName=" + eName + ", deptm=" + deptm + "]";
	}
	
	
	
	
	
	

}

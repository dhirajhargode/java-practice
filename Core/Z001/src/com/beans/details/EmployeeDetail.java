package com.beans.details;

public class EmployeeDetail {
	
	private String empId;
	private String empName;
	private long mobileNo;
	private String add;
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getAdd() {
		return add;
	}
	public void setAdd(String add) {
		this.add = add;
	}
	@Override
	public String toString() {
		return "\nEmployeeDetail [empId=" + empId + ", empName=" + empName + ", mobileNo=" + mobileNo + ", add=" + add
				+ "]";
	}
	
	
	

}

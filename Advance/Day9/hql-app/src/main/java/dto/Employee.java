package dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@NamedNativeQuery(name="selAll",query="select * from emp1",resultClass=Employee.class)
@Entity
@Table(name="emp1")
public class Employee {
	@Id
	@Column(name="emp_id")
	private int empId;
	@Column(name="emp_name")
	private String empName;
	@Column(name="basic_salary")
	private float basicSalary;
	private String dept;
	@Column(name="hire_date")
	@Temporal(TemporalType.DATE)
	private Date hireDate;
	public Employee() {
		super();
	}
	public Employee(int empId) {
		super();
		this.empId = empId;
	}
	public Employee(int empId, String empName, float basicSalary, String dept, Date hireDate) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.basicSalary = basicSalary;
		this.dept = dept;
		this.hireDate = hireDate;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public float getBasicSalary() {
		return basicSalary;
	}
	public void setBasicSalary(float basicSalary) {
		this.basicSalary = basicSalary;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public Date getHireDate() {
		return hireDate;
	}
	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}
	@Override
	public String toString() {
		return empId + " " + empName + " " + basicSalary + " " + dept+ " " + hireDate;
	}
	
	
	

}

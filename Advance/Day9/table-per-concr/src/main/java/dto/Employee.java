package dto;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
public class Employee {
	@Id
	@Column(name="emp_id")
	private int empId;
	@Column(name="emp_name")
	private String empName;
	@Column(name="basic_salary")
	protected float basicSalary;
	public Employee() {
		super();
	}
	
	public Employee(int empId, String empName, float basicSalary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.basicSalary = basicSalary;
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
	@Override
	public String toString() {
		return empId + " " + empName + " " + basicSalary;
	}
	
	
	

}

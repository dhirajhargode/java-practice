package dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="emp_3")
public class Employee {

	@Id
	private int empID;
	private String empName;
	private int empSal;
	/**
	 * @param empID
	 * @param empName
	 * @param empSal
	 */
	public Employee(int empID, String empName, int empSal) {
		this.empID = empID;
		this.empName = empName;
		this.empSal = empSal;
	}
	/**
	 * 
	 */
	public Employee() {
	}
	public int getEmpID() {
		return empID;
	}
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getEmpSal() {
		return empSal;
	}
	public void setEmpSal(int empSal) {
		this.empSal = empSal;
	}
	
	
	
}

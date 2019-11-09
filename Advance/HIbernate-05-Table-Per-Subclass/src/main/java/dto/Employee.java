package dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name = "inh2_employee")
@Inheritance(strategy = InheritanceType.JOINED)
public class Employee {

	@Id
	private Integer empId;
	private String empName;
	private Double basicSalary;

	public Employee() {
		super();
	}

	public Employee(Integer empId, String empName, Double basicSalary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.basicSalary = basicSalary;
	}

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Double getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(Double basicSalary) {
		this.basicSalary = basicSalary;
	}

	@Override
	public String toString() {
		return empId + " " + empName + " " + basicSalary;
	}

}

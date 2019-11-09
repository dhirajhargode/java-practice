package dto;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "inh3_manager")
public class Manager extends Employee {

	private Double ta;
	private Double da;

	/**
	 * 
	 */
	public Manager() {
	}

	/**
	 * @param empId
	 * @param empName
	 * @param basicSalary
	 * @param ta
	 * @param da
	 */
	public Manager(Integer empId, String empName, Double basicSalary, Double ta, Double da) {
		super(empId, empName, basicSalary);
		this.ta = ta;
		this.da = da;
	}

	public Double getTa() {
		return ta;
	}

	public void setTa(Double ta) {
		this.ta = ta;
	}

	public Double getDa() {
		return da;
	}

	public void setDa(Double da) {
		this.da = da;
	}

	@Override
	public String toString() {
		return ta + " " + da;
	}

}

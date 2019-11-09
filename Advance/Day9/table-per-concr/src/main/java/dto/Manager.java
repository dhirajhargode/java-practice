package dto;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="mgr_inh3")
public class Manager extends Employee {
	private float ta;
	private float da;
	public Manager() {
		super();
	}
	public Manager(int empId, String empName, float basicSalary, float ta, float da) {
		super(empId, empName, basicSalary);
		this.ta = ta;
		this.da = da;
	}
	public float getTa() {
		return ta;
	}
	public void setTa(float ta) {
		this.ta = ta;
	}
	public float getDa() {
		return da;
	}
	public void setDa(float da) {
		this.da = da;
	}
	@Override
	public String toString() {
		return super.toString()+" "+ta + " " + da;
	}
	
	
}

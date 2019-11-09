package dto;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value="clr")
public class Clerk extends Employee {
	private float hra;

	public Clerk() {
		super();
	}

	public Clerk(int empId, String empName, float basicSalary, float hra) {
		super(empId, empName, basicSalary);
		this.hra = hra;
	}

	public float getHra() {
		return hra;
	}

	public void setHra(float hra) {
		this.hra = hra;
	}

	@Override
	public String toString() {
		return super.toString()+" " + hra;
	}
	

}

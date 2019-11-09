package dto;


import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="inh2_Clerk")
public class Clerk extends Employee {

	private Double hra;

	public Clerk() {
		super();
	}

	/**
	 * @param empId
	 * @param empName
	 * @param basicSalary
	 * @param hra
	 */
	public Clerk(Integer empId, String empName, Double basicSalary, Double hra) {
		super(empId, empName, basicSalary);
		this.hra = hra;
	}

	public Double getHra() {
		return hra;
	}

	public void setHra(Double hra) {
		this.hra = hra;
	}

	@Override
	public String toString() {
		return hra + "";
	}

}

package com.sarang.domain;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class employeeComposit {
	private String prgmName;
	private String projName;
	private int salary;
	@EmbeddedId
	private Composite id;

	public String getPrgmName() {
		return prgmName;
	}

	public void setPrgmName(String prgmName) {
		this.prgmName = prgmName;
	}

	public String getProjName() {
		return projName;
	}

	public void setProjName(String projName) {
		this.projName = projName;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public Composite getId() {
		return id;
	}

	public void setId(Composite id) {
		this.id = id;
	}

}

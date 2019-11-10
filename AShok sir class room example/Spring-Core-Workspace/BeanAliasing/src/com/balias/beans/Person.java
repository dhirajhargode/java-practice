package com.balias.beans;

public class Person {

	private Integer personId;
	private String personName;
	private String personEmail;

	public void setPersonId(Integer personId) {
		this.personId = personId;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public void setPersonEmail(String personEmail) {
		this.personEmail = personEmail;
	}

	@Override
	public String toString() {
		return "Person [personId=" + personId + ", personName=" + personName + ", personEmail=" + personEmail + "]";
	}

}

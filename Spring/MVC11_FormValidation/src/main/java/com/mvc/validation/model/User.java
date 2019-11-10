package com.mvc.validation.model;

import java.util.List;

public class User {

	private String username;
	private String password;
	private String email;
	private Long mobno;
	private String gender;
	private List<String> intrestedcourses;
	private List<String> preftimings;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getMobno() {
		return mobno;
	}

	public void setMobno(Long mobno) {
		this.mobno = mobno;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public List<String> getIntrestedcourses() {
		return intrestedcourses;
	}

	public void setIntrestedcourses(List<String> intrestedcourses) {
		this.intrestedcourses = intrestedcourses;
	}

	public List<String> getPreftimings() {
		return preftimings;
	}

	public void setPreftimings(List<String> preftimings) {
		this.preftimings = preftimings;
	}

}

package com.cdac.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "RegisterUser")
public class User {

	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "user_id")
	private Integer userid;

	@Column(name = "user_name")
	private String username;

	@Column(name = "user_pass")
	private String password;

	public User() {
	}

	/**
	 * @param userid
	 * @param username
	 * @param password
	 */
	public User(Integer userid, String username, String password) {
		this.userid = userid;
		this.username = username;
		this.password = password;
	}

	public Integer getUserid() {
		return userid;
	}

	public void setUserid(Integer userid) {
		this.userid = userid;
	}

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

	@Override
	public String toString() {
		return userid + " " + username + " " + password;
	}

}

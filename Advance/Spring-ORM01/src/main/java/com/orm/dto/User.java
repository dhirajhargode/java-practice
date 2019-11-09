package com.orm.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user11")
public class User {

	@Id
	private Integer userId;
	private String userName;
	private String userPass;

	public User() {
	}

	/**
	 * @param userId
	 * @param userName
	 * @param userPass
	 */
	public User(Integer userId, String userName, String userPass) {
		this.userId = userId;
		this.userName = userName;
		this.userPass = userPass;
	}

	/**
	 * @param userId
	 */
	public User(Integer userId) {
		this.userId = userId;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPass() {
		return userPass;
	}

	public void setUserPass(String userPass) {
		this.userPass = userPass;
	}

	@Override
	public String toString() {
		return userId + " " + userName + " " + userPass;
	}

}

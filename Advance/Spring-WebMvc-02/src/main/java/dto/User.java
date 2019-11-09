package dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user_web")
public class User {

	@Id
	@Column(name = "user_id")
	private Integer userId ;

	@Column(name = "user_name")
	private String userName;

	@Column(name = "user_pass")
	private String passWord;

	@Column(name = "role")
	private String userRole;

	public User() {
	}

	/**
	 * @param userId
	 * @param userName
	 * @param passWord
	 * @param userRole
	 */
	public User(Integer userId, String userName, String passWord, String userRole) {
		this.userId = userId;
		this.userName = userName;
		this.passWord = passWord;
		this.userRole = userRole;
	}

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

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public String getUserRole() {
		return userRole;
	}

	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}

	@Override
	public String toString() {
		return userId + " " + userName + " " + passWord + " " + userRole;
	}

}

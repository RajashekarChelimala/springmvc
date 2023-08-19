package cgg.spring.mvc.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Users {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String userName;
	private String email;
	private String password;
	public String getUserName() {
		return userName;
	}
	@Override
	public String toString() {
		return "User [userName=" + userName + ", email=" + email + ", password=" + password + "]";
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Users() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Users(String userName, String email, String password) {
		super();
		this.userName = userName;
		this.email = email;
		this.password = password;
	}
}

package com.sample;


public class User {

	private String userName;
	
	private String userSal;
	
	public User(String userName, String userSal) {
		super();
		this.userName = userName;
		this.userSal = userSal;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserSal() {
		return userSal;
	}

	public void setUserSal(String userSal) {
		this.userSal = userSal;
	}
	
	
}

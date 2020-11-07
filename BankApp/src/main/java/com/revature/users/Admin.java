package com.revature.users;

import com.revature.fileslogging.Roster;

public class Admin {
	private String username;
	private String password;

	public Admin() {
		super();
		Roster.adminList.add(this);
	}
	public Admin(String username, String password) {
		this.username = username;
		this.password = password;
		Roster.adminList.add(this);
		
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
		return "Employee [username=" + username + ", password=" + password + "]";
	}


}

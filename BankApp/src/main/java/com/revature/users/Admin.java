package com.revature.users;

import java.io.Serializable;

import com.revature.fileslogging.AdminFile;
import com.revature.fileslogging.LogThis;
import com.revature.fileslogging.Roster;
import com.revature.fileslogging.UserFile;

public class Admin implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -5513646448797799832L;

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
		AdminFile.writeAdminFile(Roster.adminList);
		LogThis.LogIt("info", "A new admin has been created, ");
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
		return "Admin [username=" + username + ", password=" + password + "]";
	}


}

package com.revature.bank;

import java.io.Serializable;

public class User implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3935488534141193534L;

	private String username;
	private String password;

	public User() {
		super();
		Roster.userList.add(this);//because we are referring to the objects that is being created at that time
		//if we didn't write the array list there is a possibility that we could lose the info
		UserFile.writeUserFile(Roster.userList);
		//it will save to the arraylist and write to a file in the constructor.
	}
	public User(String username, String password) {
		this.username = username;
		this.password = password;
		Roster.userList.add(this);
		UserFile.writeUserFile(Roster.userList);
		LogThis.LogIt("info", "A new user has been created, "+ this.username );
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
		return "User [username=" + username + ", password=" + password + "]";
	}
	
	
}

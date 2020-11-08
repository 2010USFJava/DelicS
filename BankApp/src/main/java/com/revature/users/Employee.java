package com.revature.users;

import java.io.Serializable;

import com.revature.fileslogging.LogThis;
import com.revature.fileslogging.Roster;
import com.revature.fileslogging.UserFile;

public class Employee implements Serializable{
/**
 * 
 */
private static final long serialVersionUID = -9019522254561627764L;

private String username;
private String password;

public Employee() {
	super();
	Roster.employeeList.add(this);
}
public Employee(String username, String password) {
	this.username = username;
	this.password = password;
	Roster.employeeList.add(this);
	UserFile.writeEmployeeFile(Roster.employeeList);
	LogThis.LogIt("info", "A new employee has been created, ");
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

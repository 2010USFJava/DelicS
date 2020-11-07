package com.revature.bank;

public class Employee {
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

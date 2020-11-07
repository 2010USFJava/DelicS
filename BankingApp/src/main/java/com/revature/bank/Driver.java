package com.revature.bank;

public class Driver {
	public static void main(String[] args) {
	UserFile.readUserFile();
	CustomerFile.readCustomerFile();
	Menu.startMenu();
	
	}
}

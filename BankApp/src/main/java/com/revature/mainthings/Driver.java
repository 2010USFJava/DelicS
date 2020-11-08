package com.revature.mainthings;

import com.revature.fileslogging.*;

public class Driver {
	public static void main(String[] args) {
	UserFile.readEmployeeFile();
	AdminFile.readAdminFile();
	CustomerFile.readCustomerFile();
	Menu.startMenu();
	
	}
}

package com.revature.bankingapp;
//import com.revature.bankingapp.Customer;
//import com.revature.bankingapp.CustomerFileIO;

public class Driver{
	public static void main (String[]args) {
		CustomerFileIO.readCustomerFile();
		Menu.startMenu();
	}
}


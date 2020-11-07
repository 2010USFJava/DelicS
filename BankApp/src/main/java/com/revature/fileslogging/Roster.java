package com.revature.fileslogging;

import java.util.ArrayList;
import java.util.List;

import com.revature.users.*;
import com.revature.mainthings.Menu;


public class Roster {
	public static List<User> userList = new ArrayList<User>();
	public static List<Employee> employeeList = new ArrayList<Employee>();
	public static List<Admin> adminList = new ArrayList<Admin>();
	public static List<Customer> customerList = new ArrayList<Customer>();
	
	public static User findUserByUsername(String inputName) {
		for (int i = 0; i < customerList.size(); i++) {
			String name= customerList.get(i).getUsername();
			if(inputName.equals(name)) {
				return customerList.get(i);
			}
		}
		
		System.out.println("User not found");
		Menu.startMenu();
		return null; 
		}
	
	public static Customer findCustomerByID(long inputID) {
		for (int i = 0; i < customerList.size(); i++) {
			long number= customerList.get(i).getId();
			if(inputID == number) {
				return customerList.get(i);
			}
		}
		
		System.out.println("Customer not found");
		Menu.startMenu();
		return null; 
		}
	
	public static void removeAccountByID(long inputID) {
		for (int i = 0; i < customerList.size(); i++) {
			long number= customerList.get(i).getId();
			if(inputID == number) {
			customerList.remove(i);
			}
		}
		//System.out.println("Not able to remove");
		//loginPortalE();
		//return null;
	}
	public static Customer viewCustomerByID(int inputID) {
		for (int i = 0; i < customerList.size(); i++) {
			long number= customerList.get(i).getId();
			if(inputID == number) {
				return customerList.get(i);
			}
		}
		
		System.out.println("Account not found");
		Menu.startMenu();
		return null; 
		}
	public static void approveAccount(long inputID) {
		for (int i = 0; i < customerList.size(); i++) {
			long number = customerList.get(i).getId();
			if (inputID == number){
				customerList.get(i).setAccountOn(true);
			}
		}
	}
	
	public static void denyAccount(long inputID) {
		for (int i = 0; i < customerList.size(); i++) {
			long number = customerList.get(i).getId();
			if (inputID == number){
				customerList.get(i).setAccountOn(false);
			}
		}
	}
}

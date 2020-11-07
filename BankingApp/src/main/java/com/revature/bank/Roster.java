package com.revature.bank;

import java.util.ArrayList;
import com.revature.bank.Customer;
import java.util.List;
import java.util.UUID;

public class Roster {
		public static List<User> userList = new ArrayList<User>();
		public static List<Employee> employeeList = new ArrayList<Employee>();
		public static List<Admin> adminList = new ArrayList<Admin>();
		public static List<Customer> customerList = new ArrayList<Customer>();
		
		public static User findUserByUsername(String inputName) {
			for (int i = 0; i < userList.size(); i++) {
				String name= userList.get(i).getUsername();
				if(inputName.equals(name)) {
					return userList.get(i);
				}
			}
			
			System.out.println("User not found");
			Menu.startMenu();
			return null; 
			}
		
		public static Customer findCustomerByID(UUID inputID) {
			for (int i = 0; i < customerList.size(); i++) {
				UUID number= customerList.get(i).getAccountID();
				if(inputID.equals(number)) {
					return customerList.get(i);
				}
			}
			
			System.out.println("Customer not found");
			Menu.startMenu();
			return null; 
			}
		
		public static void removeAccountByID(UUID inputID) {
			for (int i = 0; i < customerList.size(); i++) {
				UUID number= customerList.get(i).getAccountID();
				if(inputID.equals(number)) {
				customerList.remove(i);
				}
			}
			//System.out.println("Not able to remove");
			//loginPortalE();
			//return null;
		}
		public static Customer viewCustomerByID(UUID inputID) {
			for (int i = 0; i < customerList.size(); i++) {
				UUID number= customerList.get(i).getAccountID();
				if(inputID.equals(number)) {
					return customerList.get(i);
				}
			}
			
			System.out.println("Account not found");
			Menu.startMenu();
			return null; 
			}
}

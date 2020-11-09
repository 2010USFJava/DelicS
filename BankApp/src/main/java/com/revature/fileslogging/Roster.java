package com.revature.fileslogging;

import java.util.ArrayList;
import java.util.List;

import com.revature.users.*;
import com.revature.mainthings.Menu;


public class Roster {
	public static List<Employee> employeeList = new ArrayList<Employee>();
	public static List<Admin> adminList = new ArrayList<Admin>();
	public static List<Customer> customerList = new ArrayList<Customer>();
	
	public static Customer findUserByUsername(String inputName) {
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
	public static Customer findUserByUsername2(String inputName) {
		for (int i = 0; i < customerList.size(); i++) {
			String name= customerList.get(i).getUsername2();
			if(inputName.equals(name)) {
				return customerList.get(i);
			}
		}
		
		System.out.println("User not found");
		Menu.startMenu();
		return null; 
		}
	public static Customer findUserByPassword(String inputPass) {
		for (int i = 0; i < customerList.size(); i++) {
			String pass= customerList.get(i).getPassword();
			if(inputPass.equals(pass)) {
				return customerList.get(i);
			}
		}
		
		System.out.println("User not found");
		Menu.startMenu();
		return null; 
		}
	public static Customer findUserByPassword2(String inputPass) {
		for (int i = 0; i < customerList.size(); i++) {
			String pass= customerList.get(i).getPassword2();
			if(inputPass.equals(pass)) {
				return customerList.get(i);
			}
		}
		
		System.out.println("User not found");
		Menu.startMenu();
		return null; 
		}
	
	public static Customer findByUandP(String inputUser, String inputPass) {
		for (int i = 0; i < customerList.size(); i++) {
			String pass= customerList.get(i).getPassword();
			String user= customerList.get(i).getUsername();
			if(inputUser.equals(user) && inputPass.equals(pass)) {
				return customerList.get(i);
			}
		}
		
		System.out.println("User not found");
		Menu.startMenu();
		return null; 
		
	}
	public static Customer findByUandP2(String inputUser, String inputPass) {
		for (int i = 0; i < customerList.size(); i++) {
			String pass= customerList.get(i).getPassword2();
			String user= customerList.get(i).getUsername2();
			if(inputUser.equals(user) && inputPass.equals(pass)) {
				return customerList.get(i);
			}
		}
		
		System.out.println("User not found");
		Menu.startMenu();
		return null; 
		
	}
	public static Customer findCustomerByAccount(int inputID) {
		for (int i = 0; i < customerList.size(); i++) {
			int number= customerList.get(i).getAccountNumber();
			if(inputID == number) {
				return customerList.get(i);
			}
		}
		
		System.out.println("Customer not found");
		Menu.startMenu();
		return null; 
		}
	
	public static boolean removeAccount( Customer a) {
				return customerList.remove(a);
	}
	public static Customer viewCustomerByID(int inputID) {
		for (int i = 0; i < customerList.size(); i++) {
			int number= customerList.get(i).getAccountNumber();
			if(inputID == number) {
				return customerList.get(i);
			}
		}
		
		System.out.println("Account not found");
		Menu.startMenu();
		return null; 
		
		}
	public static  void approveAccount(int inputID) { //approve account
		for (int i = 0; i < customerList.size(); i++) {
			int number = customerList.get(i).getAccountNumber();
			if (inputID == number){
				customerList.get(i).setAccountOn(true);
			}
		}CustomerFile.writeCustomerFile(Roster.customerList);
	}
	
	public static void denyAccount(int inputID) { //deny account
		for (int i = 0; i < customerList.size(); i++) {
			int number = customerList.get(i).getAccountNumber();
			if (inputID == number){
				customerList.get(i).setAccountOn(false);
			}
		}CustomerFile.writeCustomerFile(Roster.customerList);
	}
	public static Employee findEmployeeByUsername(String inputName) {
		for (int i = 0; i < employeeList.size(); i++) {
			String name= employeeList.get(i).getUsername();
			if(inputName.equals(name)) {
				return employeeList.get(i);
			}
		}
		
		System.out.println("User not found");
		Menu.startMenu();
		return null; 
		}
	public static Employee findEmployeeByPassword(String inputPass) {
		for (int i = 0; i < employeeList.size(); i++) {
			String pass= employeeList.get(i).getPassword();
			if(inputPass.equals(pass)) {
				return employeeList.get(i);
			}
		}
		
		System.out.println("User not found");
		Menu.startMenu();
		return null;
	}
	public static Admin findAdminByUsername(String inputName) {
		for (int i = 0; i < adminList.size(); i++) {
			String name= adminList.get(i).getUsername();
			if(inputName.equals(name)) {
				return adminList.get(i);
			}
		}
		
		System.out.println("User not found");
		Menu.startMenu();
		return null; 
		}
	public static Admin findAdminByPassword(String inputPass) {
		for (int i = 0; i < adminList.size(); i++) {
			String pass= adminList.get(i).getPassword();
			if(inputPass.equals(pass)) {
				return adminList.get(i);
			}
		}
		
		System.out.println("User not found");
		Menu.startMenu();
		return null;
	}
}

package com.revature.mainthings;

import java.sql.SQLException;
import java.util.*;
//import com.revature.users.Customer;
import com.revature.jdbc.beans.*;
import com.revature.jdbc.dao.AdminDao;
import com.revature.jdbc.dao.AdminDaoImpl;
import com.revature.jdbc.dao.CustomerDao;
import com.revature.jdbc.dao.CustomerDaoImpl;


public class Menu{
static Scanner scanner = new Scanner(System.in);	
static Customer a = new Customer();

	public static void startMenu() throws SQLException{
			boolean continueInput = true;
		do {
	       
	    	try {
	        	 System.out.println("[1] Customer Register" +
						"\n===================" +
	        			 '\n' + "[2] Customer Login" +
						'\n' + "[3] Admin Login \n");
				int userChoice = scanner.nextInt();
				switch (userChoice) {
				case 1:
					System.out.println("CUSTOMER \n");
				
					System.out.println("Register a username. \n");
					String username = scanner.next();
					System.out.println("Register a password \n");
					String password = scanner.next();
					System.out.println("Enter an amount as your initial deposit");
					int deposit = scanner.nextInt();
					Customer a = new Customer (username, password, deposit);
					CustomerDao cd = new CustomerDaoImpl();
					cd.insertCustomer(a);
					optionsC();
					break;
				case 2:
					optionsC();
					break;
				case 3:
					System.out.println("Enter your admin username. \n");
					String adminUser = scanner.next();
					System.out.println("Enter your admin password.\n");
					String adminPass = scanner.next();
					AdminDaoImpl a2 = new AdminDaoImpl();
					if (a2.retrieveByUser(adminUser) != null) {
						optionsA();
					}else {
						System.out.println("Admin not found");
						startMenu();
					}
					break;
				default:
					System.out.println(" \n Not an option.");
					startMenu();
					break;
				}	
				continueInput = false;
	        }
	        catch (java.util.InputMismatchException e) {
	            e.printStackTrace();
	            scanner.nextLine();
	        }

	}
		while(continueInput);
	}
	
	public static void optionsC() throws SQLException{
		boolean continueInput = true;
		do {
			try {
		System.out.println("\n Enter your username \n");
		String loginUsername = scanner.next();
		System.out.println("\n Enter your password \n");
		String loginPassword = scanner.next();
		CustomerDao a2 = new CustomerDaoImpl();
				if (a2.retrieveByUser(loginUsername) != null) {
					System.out.println("Select an option from the list below." +
							"\n [1] Deposit" +
							"\n [2] Withdraw" +
							"\n [3] Quit \n");
					int userChoice = scanner.nextInt();
					switch (userChoice) {
					case 1:
						System.out.println("Enter the ammount you would like to add to your account. \n");
						double userAmount = scanner.nextDouble();
						CustomerDao use = new CustomerDaoImpl();
						Customer c =  use.retrieveByUser(loginUsername);
						use.deposit(userAmount, c, loginUsername);
						
						System.out.println(c.toString());
						
						optionsC();
						break;
					case 2:
						System.out.println("Enter the ammount you would like to subtract from your account. \n");
						double userAmount2 = scanner.nextDouble();
						CustomerDao use2 = new CustomerDaoImpl();
						Customer c2 =  use2.retrieveByUser(loginUsername);
						use2.withdraw(userAmount2, c2, loginUsername);
						
						System.out.println(c2.toString());
						optionsC();
						break;
					case 3:
						startMenu();
						break;
					default:
						System.out.println("\n Sorry, not an option. \n");
						optionsC();
						break;
					}	
				}else {
					System.out.println("Customer not found.");
					startMenu();
				}
					continueInput = false;
						}catch(InputMismatchException e) {
							e.printStackTrace();
							scanner.nextLine();
						}
					}
				while(continueInput);
				
	}
	public static void optionsA() throws SQLException {
		boolean continueInput = true;
		do {
			try {
		System.out.println("Choose an option." +
				"\n [1] View customer accounts" +
				"\n [2] Create a customer account" +
				"\n [3] Update customer password" +
				"\n [4] Delete a customer account" + 
				"\n [5] Back to Login \n");
		int option = scanner.nextInt();

		switch (option) {
			case 1:
				CustomerDao c = new CustomerDaoImpl();
				try {
					List<Customer> cList= (ArrayList<Customer>)c.getAllCustomers();
					System.out.println(cList.toString());
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				optionsA();
				break;
			case 2:
				
				System.out.println("Register a username. \n");
				String username = scanner.next();
				System.out.println("Register a password \n");
				String password = scanner.next();
				System.out.println("Enter an amount as your initial deposit");
				int deposit = scanner.nextInt();
				Customer a = new Customer (username, password, deposit);
				CustomerDao cd = new CustomerDaoImpl();
				cd.insertCustomer(a);
				optionsA();
				break;
			case 3:
				System.out.println("Enter the username associated with the password that you would like to change.");
				String user2 = scanner.next();
				System.out.println("Enter the password that replaces the old one.");
				String newPass = scanner.next();
				CustomerDao use2 = new CustomerDaoImpl();
				Customer c4 =  use2.retrieveByUser(user2);
				use2.updatePass(user2, c4, newPass);
				
				System.out.println(c4.toString());
				optionsA();
				break;
			case 4:
				System.out.println("Select the username of the customer you want to remove");
				String user3 = scanner.next();
				CustomerDao use3 = new CustomerDaoImpl();
				Customer c5 = use3.retrieveByUser(user3);
				use3.removeCustomer(c5, user3);
				System.out.println("The customer has been removed.");
				optionsA();
				break;
			case 5:
				startMenu();
				break;

			default:
				System.out.println("Sorry, not an option");
				optionsA();
				break;
			}
				continueInput = false;
			}catch(InputMismatchException e) {
				e.printStackTrace();
				scanner.nextLine();
			}catch(NullPointerException e) {
				e.printStackTrace();
				scanner.nextLine();
			}
		}while(continueInput);
	}
}



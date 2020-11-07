package com.revature.bankingapp;

import java.util.ArrayList;
import java.util.List;

public class CustomerList {
	public static List<Customer> customerList = new ArrayList<Customer>();
	
	/*public static Customer findCustomerByUsername(String inputName) {
		for (int i = 0; i < customerList.size(); i++) {
			String name = customerList.get(i).getUsername();
			if(inputName.equals(name)) {
				return customerList.get(i);
			}
		}
		System.out.println("Customer not found");
		Menu.startMenu();
		return null;*/
	}
}

package com.revature.bankingapp;
import java.io.*;
import java.util.List;


public class CustomerFileIO {
	public static final String CustomerFile="customerList.txt";
	//write method
		public static void writeCustomerFile(List<Customer> cList) {
			try {
				
			ObjectOutputStream objectOut= new ObjectOutputStream(new FileOutputStream(CustomerFile));
			objectOut.writeObject(cList);
			objectOut.close();
			
			}catch (FileNotFoundException e) {
				e.printStackTrace();
			}catch (IOException e) {
				e.printStackTrace();
			}
		}
	//read method
		//@SuppressWarnings("unchecked")
			public static void readCustomerFile() {
				try {
					
					ObjectInputStream objectIn= new ObjectInputStream(new FileInputStream(CustomerFile));
					CustomerList.customerList= (ArrayList<Cusotmer>)objectIn.readObject();
					
				}catch (FileNotFoundException e) {
					e.printStackTrace();
				}catch (IOException e){
					e.printStackTrace();
				}
			}
}

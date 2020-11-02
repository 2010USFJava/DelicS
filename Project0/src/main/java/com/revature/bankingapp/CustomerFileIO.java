package com.revature.bankingapp;
import java.io.*;
import java.util.*;


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
	    
	    @SuppressWarnings("unchecked")
	    public static void readCustomerFile() {
	        try {
	            @SuppressWarnings("resource")
				ObjectInputStream objectIn = new ObjectInputStream(new FileInputStream(CustomerFile));
	            CustomerList.customerList = (ArrayList<Customer>)objectIn.readObject();
	        } catch (FileNotFoundException e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        } catch (IOException e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        } catch (ClassNotFoundException e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        }
	    }
}

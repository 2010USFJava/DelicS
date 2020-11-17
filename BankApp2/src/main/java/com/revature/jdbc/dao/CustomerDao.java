package com.revature.jdbc.dao;

import java.sql.SQLException;
import java.util.List;
import com.revature.jdbc.beans.*;


public interface CustomerDao {
	//crud ops
	public List<Customer> getAllCustomers() throws SQLException;
	//insert
	public void insertCustomer(Customer c) throws SQLException;
	//retrieve by id
	public void removeCustomer(Customer a, String username) throws SQLException;
	//retrieve by username
	public Customer retrieveByUser(String username) throws SQLException;
	//deposit
	public Customer deposit(double amount, Customer a, String username) throws SQLException;
	//withdraw
	public Customer withdraw(double amount, Customer a, String username) throws SQLException;
	//update password
	public Customer updatePass(String username, Customer a, String password) throws SQLException;
}
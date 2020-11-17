package com.revature.jdbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.revature.jdbc.ConnFactory;
import com.revature.jdbc.beans.Customer;
import com.revature.logging.LogThis;

public class CustomerDaoImpl implements CustomerDao{
		public static ConnFactory cf= ConnFactory.getInstance();

		public List<Customer> getAllCustomers() throws SQLException {
			List<Customer> customerList= new ArrayList<Customer>();
			Connection conn= cf.getConnection();
			Statement stmt= conn.createStatement();
			ResultSet rs= stmt.executeQuery("select * from customers;");
			Customer c= null;
			while(rs.next()) {
				c= new Customer(rs.getString(2),rs.getString(3),rs.getDouble(5));
				customerList.add(c);
			}
			return customerList;
	}
		public void insertCustomer(Customer c) throws SQLException {
			Connection conn=cf.getConnection();
			String sql= "insert into customers values(DEFAULT,?,?,DEFAULT,?)";
			PreparedStatement ps= conn.prepareStatement(sql);
			
			ps.setString(1, c.getUsername());
			ps.setString(2,  c.getPassword());	
			ps.setDouble(3, c.getBalance());
			ps.executeUpdate(); 
			LogThis.LogIt("info", "A new customer and account have been created. username is: " + c.getUsername() + " password is: " + c.getPassword());
		}

		public Customer retrieveByUser(String username) throws SQLException {
			Connection conn =cf.getConnection();
			String sql= "select * from customers where username=?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1,  username);
			ResultSet rs= ps.executeQuery();
			Customer c= null;
			while(rs.next()) {
				c= new Customer(rs.getString(2),rs.getString(3),rs.getDouble(5));
			}
			return c;
		}

		public void removeCustomer(Customer a, String username) throws SQLException {
			Connection conn=cf.getConnection();
			String sql= "delete from customers where username=?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, username);
			ps.executeUpdate();
			LogThis.LogIt("info", " A customer has been removed: "+ username );
			
		}
		public Customer deposit(double amount, Customer a, String username) throws SQLException {
			Connection conn=cf.getConnection();
			double balance = a.getBalance();
			if(amount>= 1) {
				double modBalance = balance + amount;
				if (modBalance < 0) {
					System.out.println("Account can not be overdrawn.");
				}else {
					System.out.println("The current balance is $" + modBalance + ".");
					a.setBalance(modBalance);
					String sql= "update customers set balance =? where username=?;";
					PreparedStatement ps = conn.prepareStatement(sql);
					ps.setDouble(1, modBalance);
					ps.setString(2, username);
					ps.executeUpdate();
					LogThis.LogIt("info", " A deposit has been made "+ a.getBalance() + " for " + a.getUsername() );
					return a;
				}
			}else {
				System.out.println('\n' + "Please enter a value that is not zero or negative.");		
			}
			return null;

		}
		public Customer withdraw(double amount, Customer a, String username) throws SQLException {
			Connection conn=cf.getConnection();
			double balance = a.getBalance();
			if( amount >= 1) {
				double modBalance = balance - amount;
				if (modBalance < 0) {
					System.out.println("Account can not be overdrawn.");
				}else {
					System.out.println("The current balance is $" + modBalance + ".");
					a.setBalance(modBalance);
					String sql= "update customers set balance =? where username=?;";
					PreparedStatement ps = conn.prepareStatement(sql);
					ps.setDouble(1, modBalance);
					ps.setString(2, username);
					ps.executeUpdate();
					LogThis.LogIt("info", " A withdraw has occoured with the amount of "+ a.getBalance() + " for " + a.getUsername() );
					return a;
		
				}
			}else {
				System.out.println('\n' + "Please enter a value that is not zero or negative.");		
			}
			return null;
		}

		public Customer updatePass(String username, Customer a, String password) throws SQLException {
			Connection conn=cf.getConnection();
			String sql= "update customers set pass =? where username=?;";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, password);
			ps.setString(2, username);
			ps.executeUpdate();
			a.setPassword(password);
			LogThis.LogIt("info", " A customer has an updated password: " + a.getPassword());
			return a;
		}

}

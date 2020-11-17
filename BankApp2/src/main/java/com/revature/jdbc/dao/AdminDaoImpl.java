package com.revature.jdbc.dao;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
//import java.sql.Statement;
//import java.util.ArrayList;
//import java.util.List;

import com.revature.jdbc.beans.Admin;
import com.revature.jdbc.beans.Customer;
import com.revature.jdbc.ConnFactory;

public class AdminDaoImpl {
	public static ConnFactory cf= ConnFactory.getInstance();
	
	
	public Admin retrieveByUser(String username) throws SQLException {
		Connection conn =cf.getConnection();
		String sql= "select * from admins where ausername=?";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1,  username);
		ResultSet rs= ps.executeQuery();
		Admin c= null;
		while(rs.next()) {
			c= new Admin(rs.getString(2),rs.getString(3));
		}
		return c;
	}
	public Admin retrieveById(int aid) throws SQLException {
		Connection conn =cf.getConnection();
		String sql= "select * from admins where aid=?";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setInt(1,  aid);
		ResultSet rs= ps.executeQuery();
		Admin a= null;
		while(rs.next()) {
			a = new Admin(rs.getString(1),rs.getString(2));
		}
		return a;
	}

}

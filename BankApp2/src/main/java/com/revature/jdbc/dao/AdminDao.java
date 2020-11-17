package com.revature.jdbc.dao;

import java.sql.SQLException;
import java.util.List;
import com.revature.jdbc.beans.*;

public interface AdminDao {
	//crud ops
		public List<Admin> getAllAdmins() throws SQLException;
		public Customer retrieveByUser(String username) throws SQLException;
		public Admin retrieveById(int aid) throws SQLException;
}

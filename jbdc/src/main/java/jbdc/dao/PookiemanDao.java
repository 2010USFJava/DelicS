package jbdc.dao;

import java.sql.SQLException;

import jdbc.beans.Pookieman;

public interface PookiemanDao {
	//insert
	public void catchNewPookieman(Pookieman p) throws SQLException;
		
	
	
	//retrieve by id
	public Pookieman retrieveById(int id) throws SQLException;
}

package jbdc.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import jbdc.ConnFactory;
import jbdc.dao.PookiemanDao;
import jdbc.beans.Pookieman;

public class PookiemanDaoImpl implements PookiemanDao{
	public static ConnFactory cf = ConnFactory.getInstance();
	@Override
	public void catchNewPookieman(Pookieman p) throws SQLException {
		Connection conn=cf.getConnection();
		//String sql = "insert into pookiemans values(" + p.getPid() + ","+p.getPname()+")"; // takes whatever string we give it and 
		//sends it to the database and lets the database compile it.
		//not in danger of sql injection ecause we are not taking in any parameters
		//we utilize a prepared statement. it will compile it on the java side then send it to the
		//database.
		String sql= "insert into pookiemans values(?,?)";
		PreparedStatement ps= conn.prepareStatement(sql);
		//get values into the question marks
		//ps.setInt(parameterIndex,  x);;
		ps.setInt(1, p.getPid());	//first question mark
		ps.setString(2,  p.getPname());		//second question mark
		ps.executeUpdate(); //in order to enter the info in. this return s the row count, to see
		//how many rows are updates. 
	}
	@Override
	public Pookieman retrieveById(int id) throws SQLException {
		Connection conn =cf.getConnection();
		String sql= "select * from pookiemans where pid=?";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setInt(1,  id);
		ResultSet rs= ps.executeQuery();
		Pookieman hannah= null;
		while(rs.next()) {
			hannah= new Pookieman(rs.getInt(1),rs.getString(2));
		}
		return hannah;
	}
	

}

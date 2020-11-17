package jbdc.daoimpl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import jbdc.beans.Album;
import jbdc.dao.AlbumDao;
import jbdc.ConnFactory;

public class AlbumDaoImpl implements AlbumDao{
	public static ConnFactory cf= ConnFactory.getInstance();
	
	
	@Override
	public List<Album> getAllAlbums() throws SQLException {
		List<Album> albumList= new ArrayList<Album>();
		Connection conn= cf.getConnection();
		Statement stmt= conn.createStatement();
		ResultSet rs= stmt.executeQuery("select * from \"Album\"");
		Album a= null;
		while(rs.next()) {
			a= new Album(rs.getInt(1),rs.getString(2),rs.getInt(3));
			albumList.add(a);
		}
		return albumList;
	}

}
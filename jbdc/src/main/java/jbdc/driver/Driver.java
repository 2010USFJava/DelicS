package jbdc.driver;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import jbdc.beans.Album;
import jbdc.dao.PookiemanDao;
import jbdc.daoimpl.AlbumDaoImpl;
import jbdc.daoimpl.PookiemanDaoImpl;
import jdbc.beans.Pookieman;

public class Driver {

	public static void main(String[] args) {
		AlbumDaoImpl adi=new AlbumDaoImpl();
		try {
			List<Album> aList= (ArrayList<Album>)adi.getAllAlbums();
			System.out.println(aList.toString());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		PookiemanDao pd = new PookiemanDaoImpl();
		try {
		//pd.catchNewPookieman(new Pookieman(52,"Meowth"));
			Pookieman p =pd.retrieveById(52);
			System.out.println(p.toString());
		}catch(SQLException e) {
			e.printStackTrace();
		}

	}

}
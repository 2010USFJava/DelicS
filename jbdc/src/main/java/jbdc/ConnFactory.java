package jbdc;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnFactory {
	//Singleton Factory
	//private static instance of itself
	private static ConnFactory cf;
	
	//private no args constructor
	private ConnFactory() {
		super();
	}
	
	//public static synchronized "getter" method
	public static synchronized ConnFactory getInstance() {
		if(cf==null) {
			cf= new ConnFactory();
		}
		return cf;
	}
	
	//methods that do stuff
	public Connection getConnection() {
		Connection conn= null;
		Properties prop =new Properties();
//		String url= "jdbc:postgresql://java2010usf.ccjzasyyhpja.us-east-2.rds.amazonaws.com:5432/postgres";
//		String username="kitten";
//		String password="kittensrule";
		
		try {
			prop.load(new FileReader("database.properties"));
			conn=DriverManager.getConnection(
					prop.getProperty("url"),prop.getProperty("username"),prop.getProperty("password"));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
	}
	
}
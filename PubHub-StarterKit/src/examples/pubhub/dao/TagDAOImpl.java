package examples.pubhub.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import examples.pubhub.model.Tag;
import examples.pubhub.utilities.DAOUtilities;
 
public class TagDAOImpl implements TagDAO {
	
	Connection connection = null;
	PreparedStatement stmt = null;

	public List<Tag> getTags() {
		
		List<Tag> tags = new ArrayList<>();

		try {
			connection = DAOUtilities.getConnection();	
			String sql = "SELECT * FROM Book_Tags";			
			stmt = connection.prepareStatement(sql);	
			
			ResultSet rs = stmt.executeQuery();			

			while (rs.next()) {

				Tag tag = new Tag();
				tag.setIsbn13(rs.getString("isbn_13"));
				tag.setTag(rs.getString("tag"));
				tags.add(tag);
				
			}
			
			rs.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {

			closeResources();
		}
		
		return tags;
	}
	public List<Tag> getAllTagsByIsbn(String isbn_13) {
		
		List<Tag> tags = new ArrayList<>();

		try {
			connection = DAOUtilities.getConnection();
			String sql = "SELECT * FROM Book_Tags WHERE isbn_13=?";	
			stmt = connection.prepareStatement(sql);

			stmt.setString(1, isbn_13);	
			
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				Tag tag = new Tag();
				tag.setIsbn13(rs.getString("isbn_13"));
				tag.setTag(rs.getString("tag"));
				
				tags.add(tag);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			closeResources();
		}
		
		return tags;
	}
	 public List<Tag> getBookByTag(String tag) {
	 
	 List<Tag> tags = new ArrayList<>();
	 
	 try {
		 connection = DAOUtilities.getConnection();
		 String sql = "SELECT books.title, Book_Tags.tag FROM books FULL OUTER JOIN Book_tags ON books.isbn_13=Book_Tags.isbn_13 ORDER BY books.title";
		 String sql1 = "SELECT * FROM books WHERE tag=?";
		 stmt = connection.prepareStatement(sql);
		 stmt = connection.prepareStatement(sql1);
		 ResultSet rs = stmt.executeQuery();
		 while (rs.next() ) {
			 Tag tag1 = new Tag();
			 tag1.setIsbn13(rs.getNString("isbn_13"));
			 tag1.setTag(rs.getNString("tag"));
			 tags.add(tag1);
		 }
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			closeResources();
		}
		
		return tags;
		 
	 }
	 public boolean addTag(Tag Tag) {
		
		try {
			connection = DAOUtilities.getConnection();
			String sql = "INSERT INTO Books_Tags VALUES (?, ?, ?, ?, ?, ?)";
			stmt = connection.prepareStatement(sql);

			stmt.setString(1, Tag.getIsbn13());
			stmt.setString(2, Tag.getTag());

			if (stmt.executeUpdate() != 0)
				return true;
			else
				return false;
			
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		} finally {
			closeResources();
		}
	}
	public boolean deleteTagByISBN(Tag tag) {
		try {
			Connection conn = DAOUtilities.getConnection();
			String sql = "DELETE Tag WHERE isbn_13=?";
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ps.setString(1, tag.getTag());
			if (ps.executeUpdate() !=0)
				return true;
			else 
				return false;
			
			
			
		}
		catch (SQLException e ) {
			e.printStackTrace();
			return false;
		} 
	}
	private void closeResources() {
		try {
			if (stmt != null)
				stmt.close();
		} catch (SQLException e) {
			System.out.println("Could not close statement!");
			e.printStackTrace();
		}
		
		try {
			if (connection != null)
				connection.close();
		} catch (SQLException e) {
			System.out.println("Could not close connection!");
			e.printStackTrace();
		}
	}
	
}		
				


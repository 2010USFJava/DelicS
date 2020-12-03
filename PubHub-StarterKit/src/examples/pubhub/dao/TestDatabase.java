package examples.pubhub.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import examples.pubhub.model.Book;
import examples.pubhub.utilities.DAOUtilities;

public class TestDatabase {
	Connection connection = null;	
	PreparedStatement stmt = null;
public List<Book> getAllBooks() {
		
		List<Book> books = new ArrayList<>();

		try {
			connection = DAOUtilities.getConnection();	
			String sql = "SELECT * FROM Books";			
			stmt = connection.prepareStatement(sql);	
			
			ResultSet rs = stmt.executeQuery();			

			while (rs.next()) {

				Book book = new Book();

				book.setIsbn13(rs.getString("isbn_13"));
				book.setAuthor(rs.getString("author"));
				book.setTitle(rs.getString("title"));
				
				book.setPublishDate(rs.getDate("publish_date").toLocalDate());
				book.setPrice(rs.getDouble("price"));
				
				book.setContent(rs.getBytes("content"));
				
				books.add(book);
				
			}
rs.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {

		}

		return books;
	}
}

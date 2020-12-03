package examples.pubhub.dao;

import java.util.List;


import examples.pubhub.model.Tag;

 
public interface TagDAO {
	
	 public List<Tag> getTags();
	 public List<Tag> getAllTagsByIsbn(String isbn_13);
	 public List<Tag> getBookByTag(String tag);
	 
	 public boolean addTag(Tag tag);
	 public boolean deleteTagByISBN(Tag isbn);
	 

}

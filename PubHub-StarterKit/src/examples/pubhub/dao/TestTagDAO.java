package examples.pubhub.dao;

import examples.pubhub.model.*;
import java.util.List;

public class TestTagDAO {

	  public static void main(String[] args){
	    TagDAO dao = new TagDAOImpl();
	    List<Tag> list = dao.getAllTagsByIsbn("4444444444444");

	    for (int i = 0; i < list.size(); i++){
	      Tag tag = list.get(i);
	      System.out.println(tag);
	    }
	  }

}

package com.revature.bank;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;


public class UserFile {
    
public static final String UserFile = "userList.txt";
    
    //write method
    
    public static void writeUserFile(List<User> uList) {
        try {
            ObjectOutputStream objectOut = new ObjectOutputStream(new FileOutputStream(UserFile));
            objectOut.writeObject(uList);
            objectOut.close();
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    
    //read method
    
 
    @SuppressWarnings("unchecked")
	public static void readUserFile() {
        try {
            
			ObjectInputStream objectIn = new ObjectInputStream(new FileInputStream(UserFile));
            Roster.userList = (ArrayList<User>)objectIn.readObject();
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
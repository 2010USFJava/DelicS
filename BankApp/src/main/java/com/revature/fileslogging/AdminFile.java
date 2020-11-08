package com.revature.fileslogging;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import com.revature.users.Admin;
import com.revature.users.Employee;

public class AdminFile {
public static final String AdminFile = "adminList.txt";
    
    //write method
    
    public static void writeAdminFile(List<Admin> aList) {
        try {
            ObjectOutputStream objectOut = new ObjectOutputStream(new FileOutputStream(AdminFile));
            objectOut.writeObject(aList);
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
	public static void readAdminFile() {
        try {
            
			ObjectInputStream objectIn = new ObjectInputStream(new FileInputStream(AdminFile));
            Roster.adminList = (ArrayList<Admin>)objectIn.readObject();
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

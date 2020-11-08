package com.revature.fileslogging;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import com.revature.users.Employee;
import com.revature.users.Admin;


public class UserFile {
    
public static final String EmployeeFile = "employeeList.txt";
    
    //write method
    
    public static void writeEmployeeFile(List<Employee> eList) {
        try {
            ObjectOutputStream objectOut = new ObjectOutputStream(new FileOutputStream(EmployeeFile));
            objectOut.writeObject(eList);
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
	public static void readEmployeeFile() {
        try {
            
			ObjectInputStream objectIn = new ObjectInputStream(new FileInputStream(EmployeeFile));
            Roster.employeeList = (ArrayList<Employee>)objectIn.readObject();
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
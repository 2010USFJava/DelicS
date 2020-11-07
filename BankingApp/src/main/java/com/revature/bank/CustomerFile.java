package com.revature.bank;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class CustomerFile {

    public static final String CsFile = "csFile.txt";
    
    //write method
    
    public static void writeCustomerFile(List<Customer> cList) {
        try {
            ObjectOutputStream objectOut = new ObjectOutputStream(new FileOutputStream(CsFile));
            objectOut.writeObject(cList);
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
	public static void readCustomerFile() {
        try {
            
			ObjectInputStream objectIn = new ObjectInputStream(new FileInputStream(CsFile));
            Roster.customerList = (ArrayList<Customer>)objectIn.readObject();
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

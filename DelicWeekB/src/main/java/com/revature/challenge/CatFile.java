package com.revature.challenge;
import java.io.*;
import java.util.*;

public class CatFile {
    
    public static final String CatFile = "catList.txt";
    
    //write method
    
    public static void writeCatFile(List<Cat> cList) {
        try {
            ObjectOutputStream objectOut = new ObjectOutputStream(new FileOutputStream(CatFile));
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
	public static void readCatFile() {
        try {
            @SuppressWarnings("resource")
			ObjectInputStream objectIn = new ObjectInputStream(new FileInputStream(CatFile));
            CatList.catList = (ArrayList<Cat>)objectIn.readObject();
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
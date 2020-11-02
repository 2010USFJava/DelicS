package com.revature.util;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;

import com.revature.beans.Warrior;

public class FileStuff {
	public static final String warriorFile="warriorList.txt";
//write method
	public static void writeWarriorFile(List<Warrior> wList) {
		try {
		ObjectOutputStream ojectOut= new ObjectOutputStream(new FileOutputStream(new warriorFile));
		objectOut.writeObject(wList);
		objectOut.close();
		}catch (FileNotFoundException e) {
		e.printStackTrace();
	}catch (IOException e) {
		e.printStackTrace();
	}
//read method
		public static void readWarriorFile() {
			try {
				ObjectInputStream objectIn= new ObjectInputStream(new FileInputStream(warriorFile));
				Roster.warriorList= (ArrayList<Warrior>)objectIn.readObject();
			}catch (FileNotFoundException e) {
				e.printStackTrace();
			}catch (IOException e){
				e.printStackTrace();
			}
		}
			
		}
}

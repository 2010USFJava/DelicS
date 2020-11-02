package com.revature.io;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;


public class IO {
	//reading and writing to a file
//write method
	public void writeOutputStreamContents(String contents) {
		OutputStream os=null;
		File file =new File("output.txt");
		
		//false will override, true will append to the end
		try {
		os=new FileOutputStream(file, false);
		os.write(contents.getBytes()); //if the string is human readable then characters, if it is 
		//not human readable then it could be expensive for what machine needs to read it
		//so byteStreams are better for that
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
		if(os!=null) {
			try {
				os.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
//read method
	public String readInputStreamContents() {
		InputStream is=null;
		File file = new File("input.txt");
		StringBuilder s=new StringBuilder(); //that way we don't overload our string pool
		
		try {
			is = new FileInputStream(file);
			}catch (FileNotFoundException e) {
			e.printStackTrace();
			}
		int b=0;
		try {
		while((b=is.read())!=-1) {//how we read the bytecode. the -1 lets us know we are at the end of the file 
			char c=(char) b; //getting a letter as you read threough the strings in the file
			s.append(c); //appending stringbuilder with each character to stitch the string back together 
		}
		}catch (IOException e) {
			e.printStackTrace();
		}
		if (is!=null) {
			try {
			is.close();
			}catch (IOException e) {
				e.printStackTrace();
			}
			
			}
		return s.toString();
	}
}

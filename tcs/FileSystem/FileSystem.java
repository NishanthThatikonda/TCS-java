package com.tcs.FileSystem;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileSystem {
public static void main(String[] args) {
	FileOutputStream fill=null;
	try {
		 fill=new FileOutputStream("t1.txt");
		 String st="Kishan is not a java developer";
		 byte b[]=st.getBytes();
		 fill.write(b);
		 
	} catch (FileNotFoundException e) {
		System.out.println("Location wrong");
	} catch (IOException e) {
		System.out.println("Problem while writing the data in to the file");
		;
		e.printStackTrace();
	}
	finally{
		try {
			fill.close();
		} catch (IOException e) {
			System.out.println("Not closed properly");
			e.printStackTrace();
		}
	}
}
}

package com.tcs.FileSystem;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileSystemWithoutFinally {
public static void main(String[] args) {
//	 fill=null;
	try(FileOutputStream foll=new FileOutputStream("t2.txt");) {
		 
		 String st="Nishanth is  a java developer";
		 byte b[]=st.getBytes();
		 foll.write(b);
		 
	} catch (FileNotFoundException e) {
		System.out.println("Location wrong");
	} catch (IOException e) {
		System.out.println("Problem while writing the data in to the file");
		e.printStackTrace();
	}
	
}
}

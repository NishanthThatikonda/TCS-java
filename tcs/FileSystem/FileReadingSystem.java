package com.tcs.FileSystem;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReadingSystem {
public static void main(String[] args) {
	try {
		FileInputStream fill=new FileInputStream("t1.txt");
		int i=0;
		StringBuffer sb=new StringBuffer();
		while((i=fill.read()) != -1) {
			char ch=(char)i;
			sb.append(ch);
		}
		System.out.println(sb.toString());
	} catch (FileNotFoundException e) {
		System.out.println("File Cant be found ");
		e.printStackTrace();
	} catch (IOException e) {
		System.out.println("It is not a Valid Read Operation");
		e.printStackTrace();
	}
}
}

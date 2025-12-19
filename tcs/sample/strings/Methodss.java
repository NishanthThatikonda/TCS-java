package com.tcs.sample.strings;

public class Methodss {
 public static void main(String[] args) {
	String str1="Tom :I am from Austrila";
	String str2= "Rick:Iam from Canada";
	//void printCountry(str1);
	
	String[] str3= str1.split(":");
	String[] str4= str1.split(" ");
	System.out.println(str3[0]);
	System.out.println(str3[0]);
	String[] words=str1.split(" ");
	for(String w:words) {
		if(w.equals("Tom") || w.equals("Austrila")) {
		System.out.println(w);
		
	}
	//String str3= str1.substring(0, 3);

	}
	//System.out.println(str3);
}
}

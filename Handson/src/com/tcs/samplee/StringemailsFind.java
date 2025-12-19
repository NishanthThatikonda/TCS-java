package com.tcs.samplee;

public class StringemailsFind {
public static void main(String[] args) {
	String s= "abc@gmail.com xyz@tcs.com pqr@tcs.com";
	int count=0;
	String tcs[]=s.split(" ");
	for(int i=0; i<tcs.length; i++) {
		//System.out.println(tcs[i]);
		if(tcs[i].startsWith("tcs.com") || tcs[i].endsWith("tcs.com")) {
			count++;
		
		}
		
	}
	System.out.println(count);
}
} 

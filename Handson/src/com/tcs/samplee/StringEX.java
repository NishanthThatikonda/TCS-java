package com.tcs.samplee;



public class StringEX {
public static void main(String[] args) {
	String s1="hi how are you i am good ";
	String maxword="";
	String [] str= s1.split(" ");
	for(int i=0; i<str.length; i++) {
		if(maxword.length()< str[i].length()) {
			maxword=str[i];
		}
	}
	System.out.println("max word:" + maxword );
}
}

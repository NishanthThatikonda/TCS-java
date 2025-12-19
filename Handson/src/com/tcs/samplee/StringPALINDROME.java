package com.tcs.samplee;
import java.util.*;
public class StringPALINDROME {
public static void main(String[] args) {
	System.out.println("Enter the input string : ");
	Scanner sc= new Scanner(System.in);
	String input= sc.nextLine();
	//for(int i=input.length()-1; i>=0;i--)
	StringBuffer sb= new StringBuffer(input);
	String rev= sb.reverse().toString();
	if(input.equals(rev)) {
		System.out.println("it is palindrome");
	}
	else {
		System.out.println("not a palindrome");
	}
}
}

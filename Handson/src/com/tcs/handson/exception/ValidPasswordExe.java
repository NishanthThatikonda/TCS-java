package com.tcs.handson.exception;

import java.util.Scanner;


public class ValidPasswordExe {
public static void main(String[] args) throws PasswordException {
	Scanner sc= new Scanner(System.in);
	System.out.println("enter username :");
	String username= sc.nextLine();
	System.out.println("enter password: ");
	String password= sc.nextLine();
	VaildPassword vp= new VaildPassword();
	try {
		vp.VaildPassword(password);
	}catch(PasswordException pe){
	throw pe;
		
	}
}
}

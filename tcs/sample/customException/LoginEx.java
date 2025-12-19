package com.tcs.sample.customException;
import java.util.*;
public class LoginEx {
public static void main(String[] args) throws LoginException {
	Scanner sc= new Scanner(System.in);
	System.out.println("enter username :");
	String username= sc.nextLine();
	System.out.println("enter password: ");
	String password= sc.nextLine();
	ValidateUser ur= new ValidateUser();
	try {
		ur.validate(username, password);
	}catch(LoginException rr) {
		throw rr;
		
	}
	
			}
}

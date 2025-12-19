package com.tcs.sample.customException;

public class ValidateUser {
public void validate(String username, String password) throws LoginException{
	if(username.equals("admin") && password.endsWith("admin123")) {
		System.out.println("Welcome the user");
	}
	else {
		System.out.println("give the correct credientiels");
	}
}
}

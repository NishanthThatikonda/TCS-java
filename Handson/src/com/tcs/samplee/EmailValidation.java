package com.tcs.samplee;

public class EmailValidation {
public static void main(String[] args) {
	String email="test@gmail.com";
	if(isValid(email)) {
		System.out.println("is valid email");
		
	}
	else {
		System.out.println("not valid email");
	}
}


public static boolean isValid(String email) {
	if(!email.contains("@")){
			return false;
}
	if(email.indexOf("@")!=email.lastIndexOf("@")) {
		return false;
	}
	return true;
}
}

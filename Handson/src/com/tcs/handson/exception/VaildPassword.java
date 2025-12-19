package com.tcs.handson.exception;

import java.util.regex.Pattern;

public class VaildPassword {
 void VaildPassword(String password) throws PasswordException {
	 boolean flage= false;
	if(password.length() >6 && password.length() <10  ){
		flage= true;
		
	}
	String regex="^(?=.*\\d)(?=.*[^a-zA-Z0-9\\s]).*$";
			Pattern pattern = Pattern.compile(regex);
			if(pattern.matcher(password).matches() && flage) {
				System.out.println("valid password");
			}else {
				PasswordException pe= new PasswordException("invalid");
				throw pe;
			}
			//return flage;
			
	
		
	}
	
}
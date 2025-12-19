package com.tcs.sample.basics.constructor;

public class AccountEx {

	public static void main(String[] args) {
		Account ac= new Account(2345,"sbi");
		Account ac2= new Account(2345,"icici",50);
		ac.show();
		ac2.display();
		
	}
}

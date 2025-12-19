package com.tcs.vms;

public class Person {
	private String fname;
	private String  lname;
	
	
	public Person() {
		System.out.println("default of person");
	}


	public Person(String fname, String lname) {
	
		this.fname = fname;
		this.lname = lname;
		System.out.println(fname +" " + lname);
	}
	

}

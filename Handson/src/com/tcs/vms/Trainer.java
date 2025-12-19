package com.tcs.vms;

public class Trainer extends Person{
private String subject;
private double salary; 
private String type;
public Trainer(String fname, String lname,String subject, double salary, String type) {
	super(fname,  lname);
	this.subject = subject;
	this.salary = salary;
	this.type = type;
	
	System.out.println(subject + " " + salary + " "+ type);
}


}

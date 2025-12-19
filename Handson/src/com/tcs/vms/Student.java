package com.tcs.vms;

public class Student extends Person{
private int stdno;
private String stdadd;


public Student(String fname, String lname, int stdno, String stdadd) {
	super(fname, lname);
	this.stdno = stdno;
	this.stdadd = stdadd;
	
	System.out.println(stdno + " "+ stdadd);
}

}

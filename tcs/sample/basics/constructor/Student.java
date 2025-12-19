package com.tcs.sample.basics.constructor;

public class Student {
int stdno;
String stdname;
int m1;
int m2;
int m3;
public Student(int stdno, String stdname) {
	this.stdno=stdno;
	this.stdname=stdname;
	
}
public void setmarks(int m1, int m2, int m3) {
	this.m1=m1;
	this.m2= m2;
	this.m3= m3;
	
}
public void displayStdDetails() {
	System.out.println(stdno + " " + stdname);
}
public void displayStdPermance() {
	System.out.println(m1+" " + m2 + " " + " " + m3 ) ;
	float avg= (m1+m2+m3)/3.0f;
	System.out.println("average marks:" + avg);
}
}

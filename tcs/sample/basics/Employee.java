package com.tcs.sample.basics;

public class Employee {
	int empno;
 	String  ename;
 	int salary;
 	
 	public void setValues(int eid, String nam, int sal ) {
 		empno=eid;
 		ename= nam;
 		salary= sal;
 		
 	}
 	public void show() {
 		System.out.println(empno + " " + ename + " " + salary );
 	}
 	
}

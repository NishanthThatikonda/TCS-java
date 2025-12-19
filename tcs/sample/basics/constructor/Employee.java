package com.tcs.sample.basics.constructor;

public class Employee {
	int empno;
 	String  ename;
 	int salary;
 	
 	 public Employee(){
 		empno=1;
 		ename="kishan";
 		salary=34444;
 	}
 	Employee(int eno, String enam, int sal){
 		empno=eno;
 		ename= enam;
 		salary=sal;
 		
 	}
// 	public void setValues(int eid, String nam, int sal ) {
// 		empno=eid;
// 		ename= nam;
// 		salary= sal;
// 		
// 	}
 	public void displayInfo() {
 		System.out.println(empno + " " + ename + " " + salary );
 	}
 	
}

package com.tcs.sample.basics.constructor;

public class Sample {
	public static void main(String[] args) {
		Employee e2= new Employee();
		Employee e1= new Employee(22,"raju", 5000);

		e2.displayInfo();
		e1.displayInfo();
	}
	
}

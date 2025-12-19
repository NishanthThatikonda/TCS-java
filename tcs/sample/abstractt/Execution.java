package com.tcs.sample.abstractt;

public class Execution {
public static void main(String[] args) {
	Employee obj;
	obj=new Programmer();
	obj.jobs();
	obj.timings();
	

	obj= new Analyst();
	obj.jobs();
	obj.timings();

	obj= new Manager();
	obj.timings();
	obj.jobs();
	obj.noticeperiod();
}
}

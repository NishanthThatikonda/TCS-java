package com.tcs.sample.abstractt;

public abstract class Employee {
	private int empno;
	private String ename;
	abstract void jobs();
	abstract void timings();
	void noticeperiod() {
		System.out.println("Notice period is 2 months");
	}

}

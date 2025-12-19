package com.tcs.handson.collectionFramework;

public class Employee6 implements Comparable<Employee6>{
	private int empno;
	private String ename;
	private double sal;
	
	public Employee6(int empno, String ename, double sal) {
		
		this.empno = empno;
		this.ename = ename;
		this.sal = sal;
	}
	
	public int getEmpno() {
		return empno;
	}

	public void setEmpno(int empno) {
		this.empno = empno;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	@Override
	public int compareTo(Employee6 o) {
		return this.empno-o.empno;
	}

	
	
}

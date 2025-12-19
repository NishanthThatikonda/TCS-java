package com.tcs.java8features.streamA;

public class Employee {
private int empno;
private String ename;
private int esal;
private String deptn;
public Employee(int empno, String ename, int esal) {
	
	this.empno = empno;
	this.ename = ename;
	this.esal = esal;
	
}

public Employee(int empno, String ename, int esal, String deptn) {
	this.empno = empno;
	this.ename = ename;
	this.esal = esal;
	this.deptn = deptn;
}

public String getDeptn() {
	return deptn;
}

public void setDeptn(String deptn) {
	this.deptn = deptn;
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
public int getEsal() {
	return esal;
}
public void setEsal(int esal) {
	this.esal = esal;
}
public String toString() {
	
return empno+ " "+ ename +" "+ esal;
}

}

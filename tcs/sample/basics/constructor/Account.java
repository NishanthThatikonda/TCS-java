package com.tcs.sample.basics.constructor;

public class Account {
int accnum;
String accName;
int balance;
String ifsccode;
public Account(int accnum, String accName, int balance, String ifsccode) {
	this.accnum = accnum;
	this.accName = accName;
	this.balance = balance;
	this.ifsccode = ifsccode;
}
public Account(int accnum, String accName) {

	this(accnum,accName,0,null);
	
}

public Account(int accnum, String accName, int balance) {

	this(accnum,accName,balance,null);
	
}
public void show() {
	System.out.println(accnum + " " + accName + " " + balance + " " +ifsccode);
	 
}
public void display() {
	System.out.println(accnum + " " + accName + " "+ balance);
	 
}
	
}

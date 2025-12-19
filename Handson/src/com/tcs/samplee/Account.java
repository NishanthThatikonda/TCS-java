package com.tcs.samplee;

public class Account implements Comparable<Account>{
 int accountNumber;
 String accountName;
 double balance;
 String customerRefNum;
public String getCustomerRefNum() {
	return customerRefNum;
}
public void setCustomerRefNum(String customerRefNum) {
	this.customerRefNum = customerRefNum;
}
public Account(int accountNumber, String accountName, double balance) {
	super();
	this.accountNumber = accountNumber;
	this.accountName = accountName;
	this.balance = balance;
}
public int getAccountNumber() {
	return accountNumber;
}
public void setAccountNumber(int accountNumber) {
	this.accountNumber = accountNumber;
}
public String getAccountName() {
	return accountName;
}
public void setAccountName(String accountName) {
	this.accountName = accountName;
}
public double getBalance() {
	return balance;
}
public void setBalance(double balance) {
	this.balance = balance;
}
void show( )
{
	System.out.println(accountNumber + " "+ accountName + " " + balance);
}
@Override
public int compareTo(Account o) {
	// TODO Auto-generated method stub
	return this.accountNumber - o.getAccountNumber();
}

}

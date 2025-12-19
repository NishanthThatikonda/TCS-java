package com.tcs.samplee;

import java.util.SortedSet;
import java.util.TreeSet;

public class AccpountExample2 {
public static void main(String[] args) {
	Account a1= new Account(110,"Liskam",5000);
	Account a2= new Account(120,"Liskam",5000);
	Account a3= new Account(150,"Liskam",5000);
	Account a4= new Account(140,"Liskam",5000);
	a1.setCustomerRefNum("1a");
	a2.setCustomerRefNum("2a");
	a3.setCustomerRefNum("9a");
	a4.setCustomerRefNum("7a");
	TreeSet<Account> ss=new TreeSet<>(new AccountRefSort());
	ss.add(a1);
	ss.add(a4);
	ss.add(a2);
	ss.add(a3);
	for(Account obj:ss) {
	System.out.println(obj.getAccountName()+" "+obj.getAccountNumber()+" "+obj.getCustomerRefNum());
	}}
}

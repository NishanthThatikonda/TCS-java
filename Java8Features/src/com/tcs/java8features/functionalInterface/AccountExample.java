package com.tcs.java8features.functionalInterface;

//import java.util.Comparator;
//import java.util.TreeSet;

import java.util.*;

public class AccountExample {
public static void main(String[] args) {
	Comparator<Account> c1=(a1,a2)->(a1.getCustomerRefNum().compareTo(a2.getCustomerRefNum()));
	TreeSet<Account> ss=new TreeSet<>();
	TreeSet<Account> ss2=new TreeSet<>();
	Account a1=new Account(101, "abc", 40000);
	Account a2=new Account(102, "bc", 40000);
	Account a3=new Account(103, "ac", 40000);
a1.setCustomerRefNum("a1");
a2.setCustomerRefNum("a2");
a3.setCustomerRefNum("a3");
ss.add(a3);
ss.add(a2);
ss.add(a1);
for(Account a:ss) {
	System.out.println(a.getAccountNumber()+" "+a.getCustomerRefNum());
}
}
}

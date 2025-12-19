package com.tcs.samplee.interfacee;

public class Bankex {
public static void main(String[] args) {
	Balance b;
	b=new ICICI();
	b.deposite();
	b.displayBalance();
	b.withdraw();
	b= new Sbi();
	b.deposite();
	b.displayBalance();
	b.withdraw();
	
}
}

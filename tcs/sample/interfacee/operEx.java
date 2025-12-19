package com.tcs.sample.interfacee;

public class operEx {
public static void main(String[] args) {
	Operator ope;
	ope= new SumOperator();
	ope.open(10,20);
	
	ope= new SUbOperator();
	ope.open(10,20);
	
	}
}

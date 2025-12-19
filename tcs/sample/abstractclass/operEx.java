package com.tcs.sample.abstractclass;

public class operEx {
public static void main(String[] args) {
	Operator ope;
	ope= new SumOperator();
	ope.ope(10,20);
	
	ope= new SUbOperator();
	ope.ope(10,20);
	
	}
}

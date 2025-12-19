package com.tcs.java8features.methodReference;

public class MathsOperations {
	public MathsOperations() {

	}
public MathsOperations(int a, int b) {
	int c= a+b;
	System.out.println("sum is "+  c);
}
static public void mutliplication(int a, int b) {
	int c= a*b;
	System.out.println("multiplication is "+  c);
}

public void div(int a, int b) {
	int c= a/b;
	System.out.println("div is "+  c);
}
}

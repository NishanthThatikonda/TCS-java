package com.tcs.handson.exception;

public class Throwex {
public static void main(String[] args) {
	try {
		ThrowExample ee= new ThrowExample();
		ee.div(10,-110);
	}catch(ArithmeticException arr) {
		System.out.println("please provide only positive values");
	}
}
}

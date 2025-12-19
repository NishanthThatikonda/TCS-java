package com.tcs.handson.exception;

public class ThrowExample {
public void div(int a, int b) throws ArithmeticException{
	if(b<0) {
		ArithmeticException ae= new ArithmeticException("do not give negstivr value");
		throw ae;
	}
}
}

package com.tcs.java8features.methodReference;

public class MathMain {
public static void main(String[] args) {
	Operations ope=(a,b)->{
		int c=a-b;
		System.out.println("minus is" + c);
	};
	ope.performance(20,10);


	ope=MathsOperations::new;
	ope.performance(20, 10);

	MathsOperations mo= new MathsOperations();
	ope=mo::div;
	ope.performance(20,10);

	ope = MathsOperations::mutliplication;
	ope.performance(20, 10);






}
}

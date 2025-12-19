package com.tcs.sample.abstractclass;

public class SumOperator extends Operator {

	@Override
	void ope(int a, int b) {
		int sum= a+b;
		System.out.println("sum is: "+ sum);
		
	}

}

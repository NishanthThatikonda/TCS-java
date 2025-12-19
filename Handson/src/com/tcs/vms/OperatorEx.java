package com.tcs.vms;

public class OperatorEx {
public static void main(String[] args) {
	Operator o1= new Operator(10,20,0,0);
	o1.sum();
	o1.mul();
	o1.setValues(40, 50);
	o1.sum();
	o1.mul();
}
}

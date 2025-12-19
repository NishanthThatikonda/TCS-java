package com.tcs.vms;

public class Operator {
int a;
int b;
int c;
int d;
public Operator(int a, int b, int c, int d) {
	
	this.a = a;
	this.b = b;
	this.c = c;
	this.d = d;
}
public void sum() {
	c= a+b;
	System.out.println("sum: "+ c);
}

public void mul() {
	d= a*b;
	System.out.println("mul: "+d);
}
public void setValues(int a, int b) {
	this.a= a;
	this.b=b;
}
public void show() {
	System.out.println(a +" "+ b);
}
}

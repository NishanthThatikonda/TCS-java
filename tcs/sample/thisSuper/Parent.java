package com.tcs.sample.thisSuper;

public class Parent {
	private int a;
	private int b;
	private int c;
public void Parent() {
	System.out.println("this is default Parent");

}
public void Parent(int a, int b, int c ) {
	this.a=a;
	this.b=b;
	this.c=c;
	
	System.out.println("this is parameterized Parent");

}
}

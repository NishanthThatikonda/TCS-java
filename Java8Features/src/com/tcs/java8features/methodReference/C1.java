package com.tcs.java8features.methodReference;

public class C1 {
	void c1(){
		System.out.println("Default constructor");
	}
	void c1(int a, int b){
		System.out.println("Parameterized constructor");
	}
	void methodc1() {
		System.out.println("this is method in c1");
	}
	int methodc1(int a, int b) {
		int c= a+b;
		System.out.println(c);
		return c;

	}
	void method2c1(int a, int b) {
		int d=a-b;
		System.out.println(d);
	}
	void m1() {
		System.out.println("this is method m1");
	}
	static void m2() {
		System.out.println("this is method m1");
	}
}

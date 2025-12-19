package com.tcs.java8features.functionalInterface;

public class Main {
public static void main(String[] args) {
	Message m1=()->{
		System.out.println("hello world");
	};
	m1.givemessage();

	m1=()->{
		System.out.println("hello google");
	};
	m1.givemessage();
	m1.method1();
	Message.method2();
}
}

package com.tcs.java8features.functionalInterface;

public interface Message {
	void givemessage();
default void method1() {
	System.out.println("Method 1");
}
static void method2() {
	System.out.println("Method 2");
}
}

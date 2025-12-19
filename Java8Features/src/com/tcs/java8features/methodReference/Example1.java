package com.tcs.java8features.methodReference;

public class Example1 {
public static void main(String[] args) {
	C1 obj= new C1();
	I1 i1obj=obj::m1;

	i1obj.method1();

	i1obj=obj::methodc1;
	i1obj.method1();

	i1obj=C1::m2;
	i1obj.method1();

	i1obj=C1::new;
	i1obj.method1();


}
}

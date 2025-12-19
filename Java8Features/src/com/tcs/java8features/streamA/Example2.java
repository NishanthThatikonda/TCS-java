package com.tcs.java8features.streamA;

import java.util.List;
import java.util.stream.Stream;

public class Example2 {
public static void main(String[] args) {
	List<Employee> list= Util.getEmployee();
	//Stream <Employee> s1=list.stream();
	list.stream().forEach(x->{
		System.out.println(x);
	});	
	System.out.println("salaries greater than 5K");
	list.stream().filter(x->x.getEsal()>5000).forEachOrdered(x->System.out.println(x));
}
}

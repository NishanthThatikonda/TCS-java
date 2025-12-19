package com.tcs.java8features.streamA;

import java.util.stream.IntStream;

public class IntStreamExample {
public static void main(String[] args) {
	IntStream is= IntStream.rangeClosed(1, 10);
	is.forEach(System.out::println);
	
	IntStream is1=IntStream.rangeClosed(1,5);
	is1.forEach(x->{
		IntStream is2=IntStream.rangeClosed(1,x);
		is2.forEach(y->{
			System.out.print("x");
		});
		System.out.println();
	});
	
}
}

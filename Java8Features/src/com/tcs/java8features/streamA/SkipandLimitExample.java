package com.tcs.java8features.streamA;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SkipandLimitExample {
	public static void main(String[] args) {
		

List<Integer> list= Arrays.asList(10,20,30,40,50,60,70);
list.stream().limit(4).forEach(System.out::println);
System.out.println("skip element:");
list.stream().skip(4).forEach(System.out::println);
System.out.println("sorted list");
list.stream().sorted(Comparator.reverseOrder()).distinct().skip(2).limit(1).forEach(System.out::println);
}
}
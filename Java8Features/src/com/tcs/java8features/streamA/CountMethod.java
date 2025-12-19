package com.tcs.java8features.streamA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountMethod {
public static void main(String[] args) {
	List<Integer>list= Arrays.asList(10,2,5,-3,4);
	long count=list.stream().filter(x->x%2==0).count();
	System.out.println("Even numbers count: "+ count);
	System.out.println("printing even number multipling wit 3: ");
	list.stream().filter(x->x%2==0).map(x->x*3).forEach(System.out::println);
	}
}

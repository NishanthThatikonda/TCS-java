package com.tcs.java8features.streamA;

import java.util.Arrays;
import java.util.List;

public class ReduceExmple {
public static void main(String[] args) {
	List<Integer>list= Arrays.asList(10,20,30,40,50);
	int result=list.stream().reduce((x, y)->(x+y)).get();
	System.out.println(result);
	}
}

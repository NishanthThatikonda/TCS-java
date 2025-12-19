package com.tcs.java8features.streamA;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class AnyMatchExample {
	public static void main(String[] args) {
		
	
List<Integer>list=Arrays.asList(10,30,30,40,50);
list.stream().filter(x->x%2!=0).forEach(System.out::println);

boolean result=list.stream().anyMatch(x->x%2!=0);  // if the condition is not satisfied then we get false
System.out.println(result);
System.out.println("nonMatch");
boolean nonMatchh=list.stream().noneMatch(x->x%2!=0);
System.out.println(nonMatchh);
System.out.println("minMatch");

int min=list.stream().min((x,y)->x.compareTo(y)).get();
System.out.println(min);
	}
}

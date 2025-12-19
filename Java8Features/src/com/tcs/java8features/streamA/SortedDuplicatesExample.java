package com.tcs.java8features.streamA;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortedDuplicatesExample {
public static void main(String[] args) {
	List<Employee> list= Util.getEmployee();
	List<String>namess=list.stream().map(x->x.getEname()).distinct().collect(Collectors.toList());
	System.out.println(namess.size());
	System.out.println(namess);
	
	System.out.println("names in assending order:");
	list.stream().map(x->x.getEname()).sorted().forEach(x->System.out.println(x));
	System.out.println("names in desending order");
	list.stream().map(x->x.getEname()).sorted(Comparator.reverseOrder()).forEach(System.out::println);
	System.out.println();
	list.stream().map(x->x.getEname()).sorted((x,y)->y.compareTo(x)).forEach(System.out::println);
	}
}

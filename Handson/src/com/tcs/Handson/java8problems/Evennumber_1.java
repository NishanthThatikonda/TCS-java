package com.tcs.Handson.java8problems;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import x;
public class Evennumber_1 {
public static void main(String[] args) {
	List<Integer> list=Arrays.asList(2,44,21,32, 44,11);
	list.stream().filter(x->x%2==0).forEach(System.out::println);
	
	//2nd problem
	System.out.println("Second problem: ");
	List<String> list2=Arrays.asList("Nithin","Kishan","SaiNiketh");
	list2.stream().map(x->x.toUpperCase()).forEach(System.out::println);
	
	
	//3rd problem

	
	List<Integer> l1 = Arrays.asList(1,2,3,3,4,5,5);
	HashSet<Integer> m1 = new HashSet<>();
	Set<Integer> m2 = l1.stream().filter(x -> !m1.add(x)).collect(Collectors.toSet());
	System.out.println("m2 "+m2);
	
	//4th problem
	System.out.println("greater than 10");
	List<Integer> list4=Arrays.asList(2,44,21,32, 44,11);
	list4.stream().filter(x->x>10).limit(1).forEach(System.out::println);

	//5th problem
	System.out.println("reverseOrder: ");
	List<Integer> list5=Arrays.asList(2,44,21,32, 44,11);
	list5.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
	
	//6th problem
	System.out.println("SumOfNumbers: ");
	List<Integer> list6=Arrays.asList(2,44,21,32, 44,11);
	int sum=list6.stream().reduce((x,y)->(x+y)).get();
	System.out.println(sum);
	
	
	//7th problem
	System.out.println("occurance of each word");
	List<String> list7=Arrays.asList("Nithin","Kishan","SaiNiketh");
	//list7.stream().reduce((x,y)-> (x)equals(y)).count();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}


}
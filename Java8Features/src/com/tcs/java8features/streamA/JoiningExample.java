package com.tcs.java8features.streamA;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JoiningExample {
public static void main(String[] args) {
	List<String> list= Arrays.asList("one","two","three","four");
	String result= list.stream().collect(Collectors.joining());
	String result2= list.stream().collect(Collectors.joining(","));
System.out.println(result + " " + result2);

String input ="stream example";
long characterStream=input.chars().filter(x-> x!=' ').mapToObj(c->(char) c).count();
System.out.println(characterStream);

}
}

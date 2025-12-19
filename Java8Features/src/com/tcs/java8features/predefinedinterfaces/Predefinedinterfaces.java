package com.tcs.java8features.predefinedinterfaces;

import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class Predefinedinterfaces {
public static void main(String[] args) {
	UnaryOperator<Integer> un=(y)-> y+20;
	int result= un.apply(10);
	System.out.println(result);

	BinaryOperator<Integer> bo=(y,z)-> y+z;
	int binaryy= bo.apply(10,20);
	System.out.println(binaryy);


	Function<String, Integer> fn=(a)-> a.length();
	int funn= fn.apply("abcd");
	System.out.println(funn);


	BiFunction<String,Integer,String> bif= (a,b)->a.substring(b);
	String bifresult=bif.apply("abcd", 3);
	System.out.println(bifresult);


	Predicate<String> p= (a)-> "abc".equals(a);
	boolean Predresult = p.test("abc");
	System.out.println(Predresult);

	BiPredicate<String,Integer> bp= (a,b)-> a.substring(b).equals("abc");
	boolean bpresult= bp.test("hhhhdd",5);
	System.out.println(bpresult);


}
}

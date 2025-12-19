package com.tcs.java8features.streamA;

import java.util.List;
import java.util.stream.Collectors;

public class GroupByExample {
public static void main(String[] args) {
	List<Employee> list=Util.getEmployeewithDeptno();
	list.stream().collect(Collectors.groupingBy(x->x.getDeptn())).forEach((x,y)->System.out.println(x+ " " + y));
}
}

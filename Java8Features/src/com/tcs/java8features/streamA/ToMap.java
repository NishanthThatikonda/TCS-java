package com.tcs.java8features.streamA;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ToMap {
public static void main(String[] args) {
	List<Employee>list=Util.getEmployee();
	Map<Integer,String> maps=list.stream().collect(Collectors.toMap(x->x.getEmpno(), y->y.getEname()));

System.out.println(maps);
}
}

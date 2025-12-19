package com.tcs.java8features.streamA;

import java.util.List;
import java.util.stream.Collectors;

public class CollectExample {
public static void main(String[] args) {
	List<Employee>list= Util.getEmployee();
	List<String>names=list.stream().map(x->x.getEname()).collect(Collectors.toList());
	System.out.println(names.size());
	List<String>empid=list.stream().filter(x->x.getEmpno()>103).map(x->x.getEname()).collect(Collectors.toList());
System.out.println(empid);
	
}
}

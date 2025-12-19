package com.tcs.java8features.streamA;

import java.util.ArrayList;
import java.util.List;

public class Util {
public static List<Employee> getEmployee(){
	List<Employee> list= new ArrayList<>();
	list.add(new Employee(100,"raghu", 1000 ));
	list.add(new Employee(102,"ramesh", 6000));
	list.add(new Employee(103,"suresh", 5000 ));
	list.add(new Employee(104,"ravi", 2000 ));
	return list;

}
public static List<Employee> getEmployeewithDeptno(){
	List<Employee> list= new ArrayList<>();
	list.add(new Employee(100,"raghu", 1000, "it"));
	list.add(new Employee(102,"ramesh", 6000, "it"));
	list.add(new Employee(103,"suresh", 5000, "hr"));
	list.add(new Employee(104,"ravi", 2000, "sales"));
	return list;

}

}

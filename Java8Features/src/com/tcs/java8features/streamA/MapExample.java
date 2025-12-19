package com.tcs.java8features.streamA;

import java.util.List;

public class MapExample {
public static void main(String[] args) {
	List<Employee>list= Util.getEmployee();
	list.stream().map(x->x.getEname()).forEach(x->System.out.println(x));
	list.stream().map(x->x.getEmpno()).forEach(x->System.out.println(x));
	list.stream().map(x->x.getEsal()).filter(x->x<5000).forEach(x->System.out.println(x));
	}
}

package com.tcs.handson.collectionFramework;

import java.util.*;
import java.util.TreeMap;

public class Main6th {
	public static void main(String[] args) {
		TreeMap<Employee6, Dept> tm = new TreeMap<>();
		tm.put(new Employee6(101, "kishan", 5000), new Dept(51, "IT"));
		tm.put(new Employee6(107, "niketh", 3000), new Dept(52, "ece"));
		tm.put(new Employee6(103, "nithin", 7000), new Dept(51, "eee"));

		for (Map.Entry<Employee6, Dept> gg : tm.entrySet()) {
			
			System.out.println(gg.getKey().getEname()+  " "+gg.getKey().getEmpno()+" "+gg.getKey().getSal()+" "+gg.getValue().getId()+" "+ gg.getValue().getDeptname());
		}
		
		
	}
}

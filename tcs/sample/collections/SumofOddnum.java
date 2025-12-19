package com.tcs.sample.collections;

import java.util.ArrayList;

public class SumofOddnum {
public static void main(String[] args) {
	ArrayList<Integer> ar= new ArrayList<>();
	for(int i=1;i<=20;i++ ) {
		ar.add(i);
	}
	int sum=0;
	for(int i=0; i<ar.size();i++) {
		int n=ar.get(i);
		if(n%2!=0) {
			System.out.println(n);
			 sum= sum+n;
		}
	}
	System.out.println("sum of odd numbers :"+ sum);
}
}

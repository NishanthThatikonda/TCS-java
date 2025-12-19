package com.tcs.handson.collectionFramework;
import java.util.*;
public class Difference {
public static void main(String[] args) {
	List<Integer>list= new ArrayList<>();
	Scanner sc= new Scanner(System.in);
	int n=sc.nextInt();
	for(int i=0; i<n; i++) {
		int x= sc.nextInt();
		list.add(x);
	}
	int max=0;
	int id=0;
for(int i=0; i<n-1; i++) {
	int b=list.get(i)-list.get(i+1);
	if(b<0)
	System.out.println(b*-1);
	else
		System.out.println(b);
	if(b>max) {
		max=b;
		id=i;
		
	}
}

System.out.println(id);
}
}

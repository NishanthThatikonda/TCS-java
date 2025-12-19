package com.tcs.handson.collectionFramework;
import java.util.*;
public class KeyOdd2 {
public static void main(String[] args) {
	HashMap<Integer,Integer> hm= new HashMap<Integer, Integer>();
	hm.put(12, 90);
	hm.put(35, 90);
	hm.put(33, 90);
	hm.put(56, 86);
	int sum=0;
	int count=0;
	Set<Integer>set= new HashSet<>(hm.keySet());
	for(int i:set) {
		if(i%2!=0) {
			sum=sum+hm.get(i);
			count++;
		}
		
	}
System.out.println(sum/count);
}
}

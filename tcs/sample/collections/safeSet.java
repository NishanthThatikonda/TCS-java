package com.tcs.sample.collections;

import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArrayList;

public class safeSet {
	public static void main(String[] args) {
		Set<Integer> list= new ConcurrentSkipListSet<Integer>();
		list.add(543);
		list.add(4);
		list.add(3);
		for(int obj: list) {
			Random r= new Random();
			int n= r.nextInt(100);
			list.add(n);
			System.out.println(obj);
		}
		System.out.println(list);


	}
}

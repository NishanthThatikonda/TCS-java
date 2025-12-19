package com.tcs.sample.collections;
import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;
public class SafeArayList {
public static void main(String[] args) {
	List<Integer> list= new CopyOnWriteArrayList<Integer>();
	list.add(543);
	list.add(4);
	list.add(3);
	for(int obj: list) {
		Random r= new Random();
		int n= r.nextInt(100, 200);
		list.add(n);
		System.out.println(obj);
	}
	System.out.println(list);


}
}

package com.tcs.handson.collectionFramework;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
public class LargestKey3 {
public static void main(String[] args) {
	HashMap<Integer, String> Hm= new HashMap<>();
	Hm.put(12, "hari");
	Hm.put(13, "krish");
	Hm.put(18, "mani");
	TreeSet<Integer> hs= new TreeSet<>(Hm.keySet());
	System.out.println(Hm.get(hs.getLast()));
	
}
}

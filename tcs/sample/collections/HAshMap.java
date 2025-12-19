package com.tcs.sample.collections;
import java.util.HashMap;
import java.util.Map;
public class HAshMap {
public static void main(String[] args) {
	HashMap<Integer,String> hp=new HashMap<>();
	hp.put(1,"english");
	hp.put(2,"maths");
	hp.put(3,"science");
	hp.put(3,"social");
	
System.out.println(hp);
hp.remove(1);
for(int i: hp.keySet()) {
	String st=hp.get(i);
	System.out.println(i +" "+ st);
}
for(Map.Entry<Integer,String> enter:hp.entrySet()) {
	System.out.println(enter.getKey() + " "+ enter.getValue());
	
}

}
}

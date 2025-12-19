package com.tcs.sample.collections;
import java.util.*;
public class listExample {
public static void main(String[] args) {
	List ls= new ArrayList<>();
	ls.add(10);
	String st="Kishan";
	ls.add(st);
	System.out.println(ls);
//	ls.remove(st);
	System.out.println(ls);
	System.out.println(ls.size());
	
	System.out.println(ls);
	       Iterator it=  ls.iterator(); 
	       while(it.hasNext()){
	    	   System.out.println(it.next());
	       }
	       for(int i=0; i<ls.size(); i++) {
	    	   System.out.println(ls.get(i));
	       }
	       for(Object nish:ls) {
	    	   System.out.println(nish);
	       }
}
}

package com.tcs.sample.collections;
import java.util.*;
public class SetExample {
public static void main(String[] args) {
	Set st= new HashSet<>();
	st.add("ravi");
	st.add(34);
	st.add(34);
	st.add(33.5);
	String str1="niketh";
	st.add(str1);
	System.out.println(st);

	st.remove(str1);
	System.out.println(st);
	for(Object obj1:st ) {
		System.out.println(obj1);
	}
	for(int i=0;i<st.size();i++) {
		
	}

}
}

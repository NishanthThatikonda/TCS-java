package com.tcs.samplee;
import java.util.*;
public class AccountExc {
public static void main(String[] args) {
	TreeSet <Account> list=new TreeSet<>();
	list.add(new Account(200,"kishan", 5000));
	list.add(new Account(500,"nithin", 8000));
	list.add(new Account(300,"niketh", 88000));
	for(Account obj: list) {
		obj.show();
	}
}
}

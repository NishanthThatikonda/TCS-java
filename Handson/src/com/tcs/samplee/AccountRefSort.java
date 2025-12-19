package com.tcs.samplee;

import java.util.Comparator;

public class AccountRefSort implements Comparator<Account>{

	@Override
	public int compare(Account o1, Account o2) {
		return o1.getCustomerRefNum().compareTo(o2.getCustomerRefNum());
	}
	
	

}

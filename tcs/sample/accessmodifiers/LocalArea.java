package com.tcs.sample.accessmodifiers;

public class LocalArea {
	public static void main(String[] args) {
		Market M1= new Market();
		M1.apple="good";
		//M1.banana="bad";// private
		M1.mango="sweet";
		M1.orange="sour";
	}

}

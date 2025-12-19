package com.tcs.handson.exception;
import java.util.*;
import java.util.Scanner;
public class Exceptionn {
	void div(String input[]) throws ArithmeticException, NumberFormatException, ArrayIndexOutOfBoundsException{
		int a=Integer.parseInt(input[0]);
		int b=Integer.parseInt(input[1]);

		int c=a/b;
		System.out.println(c);
	}


}



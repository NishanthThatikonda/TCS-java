package com.tcs.FileSystem;

import java.io.IOException;

public class ResourseEx {
public static void main(String[] args) {
	try(Resourse r1=new Resourse()){
		r1.m1();
	} catch (IOException e) {
		e.printStackTrace();
	}
}
}

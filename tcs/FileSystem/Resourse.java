package com.tcs.FileSystem;

import java.io.Closeable;
import java.io.IOException;

public class Resourse implements Closeable{

	@Override
	public void close() throws IOException {
		System.out.println("This		\n"
				+ " method is called to close");
		
	}
public void m1() {
	System.out.println("Method 1");
}
}

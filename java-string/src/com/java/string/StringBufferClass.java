package com.java.string;

public class StringBufferClass {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		// StringBuffer is Final class and Threadsafe
		
		StringBuffer sb = new StringBuffer();    // initial capacity is 16
		StringBuffer sb1 = new StringBuffer("abcd");  // initial capacity 16 + buffer size of length of charsequence
		StringBuffer sb2 = new StringBuffer(5); // initial capacity is 5 here

	}

}

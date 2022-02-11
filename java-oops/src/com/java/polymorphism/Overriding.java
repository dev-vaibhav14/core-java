package com.java.polymorphism;

public class Overriding extends Overloading
{
 
	// The return type is incompatible with Overloading.add(int, int)
	
	/*
	 * The return type of the overrided method must be compatible with super class
	 * method. If super class method has primitive data type as its return type,
	 * then overrided method must have same return type in sub class also. If super
	 * class method has derived or user defined data type as its return type, then
	 * return type of sub class method must be of same type or its sub class.
	 */
	
	/*
	 * You can keep same visibility or increase the visibility of overrided method
	 * but you can’t reduce the visibility of overrided methods in the subclass. For
	 * example, default method can be overided as default or protected or public
	 * method but not as private.
	 */
	
	public int add(int a, int b)
	{
		return 1;	
	}
	
	private void showMe(String message)
	{
		System.out.println("This is show me method");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

package com.java.inheritance;

public interface InterfaceInheritance extends Interface1, Interface2
{
	
	
	
	/*
	 * A class can’t extend more than one class, but an interface can extend any
	 * number of interfaces. We will see how to extends multiple interfaces in Java.
	 * You specify that by listing the names of all interfaces to inherit from,
	 * separated by a comma.
	 */

	
	/*
	 * In JAVA 8 you can define default methods in an interface. By use of default
	 * methods, you can provide a default implementation of methods. Also, a class
	 * can implement any number of interfaces. If interfaces contain the same
	 * default methods with the same signature, the implementing class should
	 * explicitly specify which default method is to be overridden.
	 * 
	 *
	 */
	
	
	// if signature is same but return types are different then compile time error occurs - 
	// The return types are incompatible for the inherited methods Interface1.interface1(), Interface2.interface1()
	
	void show();
}

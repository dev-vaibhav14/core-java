package com.java.constructors;

public class ConstructorChaining {
	
	
	/*
	 * As you know a method can call another method. In the same manner, a
	 * constructor can call another constructor and this is known as Constructor
	 * chaining in java. In java, A constructor can call the constructor of the
	 * superclass and the constructor defined in the same class.
	 */
	
	// using both this() keyword and super() keyword.
	
	/*
	 * By default, JVM is dealing with the constructor chaining because if you are
	 * creating an object by a new keyword then JVM invokes the constructor of that
	 * class and that constructor invokes the superclass constructor. Whether you
	 * are working with a single class or inheritance, the end of the chain will
	 * always be the Object’s class constructor. Because Object is the superClass
	 * and every class is inherited from the Object class by default.
	 */
	
	
	/*
	 * this() keyword calls the constructor within class only. You can’t call this()
	 * keyword(Without arguments) from the default constructor. It shows the error
	 * “Recursive constructor invocation Record()”. Because it tries to call the
	 * default constructor again which is not possible.
	 */
	
	
	/*
	 * this() and super() must be the first statement in the constructor. If you try
	 * to place them anywhere it will show compilation time error.
	 */
	
	
	public ConstructorChaining()
	{
	//	this("vaibhav");   // Recursive constructor invocation ConstructorChaining(String)
		System.out.println("no srgs constructor");
	}
	
	public ConstructorChaining(String name)
	{
		this();
		System.out.println("this is " + name);
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		
	}

}

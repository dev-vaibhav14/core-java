package com.java.constructors;

public class Mobile {

    private String id;
	
	private String name;
	
	private String brandName;
	
	private int price;
	
	
	/*
	 * The constructor initializes the object in memory and also printing the
	 * statements. So, It initializes the object in heap memory.
	 * 
	 * When the constructor gets the call, it does check the initial value of variables. 
	 * Even the developer can provide the initial value to variables. 
	 * In the above example developer is not providing any initial value to variables.
	 *  So, the default constructor providing the default values to a variable and initialize them 
	 *  in heap memory.
	 */
	
	
	
	/*
	 * You can use a return statement inside the constructor. But you can’t return
	 * any value. Because Constructors are by default of type void. By use of return
	 * statement, you can return the control flow from the constructor.
	 */
	
	
	/*
	 * The compiler always provides a default constructor to the class but if the
	 * programmer providing any parameterized constructor then it’s the programmer’s
	 * responsibility to provide the default constructor.
	 */
	
	public Mobile()
	{
		System.out.println("no args constructor or default constructor");
		return;  // we can use return statement in the constructor
		
	}
	
	public Mobile(String id, String name, String brandName, int price) {
		super();
		this.id = id;
		this.name = name;
		this.brandName = brandName;
		this.price = price;
	}
	
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Mobile m  = new Mobile();

	}



}

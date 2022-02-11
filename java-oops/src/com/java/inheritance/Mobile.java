package com.java.inheritance;

public class Mobile {

	/*
	 * Inheritance is a mechanism by which one class can acquire/inherit the
	 * features(fields and methods) of another class.
	 */

	// The extends keyword tells the compiler that a new class making derives from
	// an existing class. The extends keywords increase or extends functionality.

	private int id;

	public String name;   // can be accessed in child class
 
	protected String ramSize;  // can be accessed in child class but only if both are in same package
	
	
	
	  public Mobile() {
		  System.out.println("Mobile no args constructor");
	  
	  }
	 
	
	public Mobile(int id, String name, String ramSize) {
		super();
		this.id = id;
		this.name = name;
		this.ramSize = ramSize;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRamSize() {
		return ramSize;
	}

	public void setRamSize(String ramSize) {
		this.ramSize = ramSize;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

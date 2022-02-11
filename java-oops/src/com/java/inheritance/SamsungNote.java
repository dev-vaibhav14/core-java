package com.java.inheritance;

public class SamsungNote extends Mobile 
{

	
	// In java, the default constructor of a parent class called automatically by the constructor of its child class. 
	//In Java, constructor of base class with no argument gets automatically called in derived class constructor.
	// if we want to call parameterized constructor of base class, then we can call it using super().
	//The point to note is base class constructor call must be the first line in derived class constructor. 

	/*
	 * public SamsungNote() {
	 * 
	 * // TODO Auto-generated constructor stub }
	 */
	
	public SamsungNote(int i)
	{
	
		// TODO Auto-generated constructor stub
	}

	public String usePen()
	{
		return "Note";
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SamsungNote sn = new SamsungNote(10);
		sn.name = "";
		sn.ramSize = "";
		sn.setId(0);
		sn.setName("");
		sn.setRamSize("");
		sn.usePen();
		
		Mobile m = new Mobile();  // cannot access child class members
		Mobile m1 = new SamsungNote(5);  // cannot access child class members
	    SamsungNote sn1 = (SamsungNote) new Mobile(); // access to child as well as Parent class members
		

	}

}

package com.java.string;

import java.util.StringJoiner;

public class StringConcat {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		String name = "vaibhav";
		
		String name2 = "mahajan";
		
		System.out.println(name + name2);
		System.out.println(name);
		System.out.println(name2);
		System.out.println(name2 + 1234);
		System.out.println(name2.concat("chikhli"));
		System.out.println(name2);
		
		
		/*
		 * The concat() method concatenates only immutable String objects and it must be
		 * called on immutable String object and its parameter must be immutable String
		 * object. But the + operator can concatenate the any non-string object like
		 * Primitive, object. It converts the non-string object to String and then
		 * append it.
		 */
		
		
		 String[] strings = {"Java", "Goal", "website", "for", "Java", "Learning"};
	     
	        String joinedString = String.join(" ", strings);
	        System.out.println(joinedString);
	        
	        StringJoiner joinerString = new StringJoiner(" ");
	         
	        joinerString.add("Java");
	        joinerString.add("Goal");
	        joinerString.add("Website");
	        System.out.println(joinerString);
	}

}

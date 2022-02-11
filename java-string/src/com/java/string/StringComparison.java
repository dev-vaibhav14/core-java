package com.java.string;

import java.util.Objects;

public class StringComparison {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		
		/*
		 * In java, the equals() method is defined in the Object class and the String
		 * class is overriding the equals() method. In String class equals() method is
		 * used for String comparison in Java. We can compare two string by use of
		 * equals() method. It compares the values of string for equality. This method
		 * compares the original content of the string and returns the value of boolean.
		 * If any character is not matched, it returns false. If all characters are
		 * matched, it returns true. The String equals() method overrides the equals()
		 * method of Object class.
		 */
		
		String str = "vaibhav";
		String str2 = "vaibhav";
		
		String name = new String("vaibhav");
		
		System.out.println(str.equals(str2));  // consider case sensitive
		System.out.println(str.equalsIgnoreCase(str2));
		System.out.println(str.equals(name));
		System.out.println(str ==  name);
		
		System.out.println(Objects.equals("vaibhav", "vaibhav"));
		
		System.out.println(str.compareTo(str2));
		
		
		/*
		 * You can compare two string by use of String.compareTo() method. returns
		 * positive value, If the first string is lexicographically greater than second
		 * string. returns a negative value, If the first string is less than the second
		 * string lexicographically. returns 0, if the first string is lexicographically
		 * equal to the second string.
		 */
		
		
		/*
		 * == operator in java This operator is also used to compare the strings. It
		 * doesn’t compare the actual value of the string. It compares the reference of
		 * string. The main difference of equals() and == operator is, The equals always
		 * compare the value of string but the == operator compares the references of
		 * strings.
		 */	}

}

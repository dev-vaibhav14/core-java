package com.java.string;

public class StringSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * To find substring in string java provides substring() method, that is
		 * overloaded.
		 */

		
		String name = "vaibhav";
		
		System.out.println(name.substring(0));
		System.out.println(name.substring(1));
		
		
		/*
		 * startIndex: It accepts only integer value, But we can’t provide negative
		 * value if we will provide it will throw StringIndexOutOfBoundsException. The
		 * startIndex value is inclusive in the substring. exception: It throws
		 * StringIndexOutOfBoundsException if the index is greater than the length or
		 * less than 0.
		 */	}
	
	
	/*
	 * In the substring method, the beginIndex is inclusive but endIndex is
	 * exclusive. So if you want to get a substring from the second character to the
	 * last character then you need to focus on the index value. The second
	 * character will present on index 1 and last character present length-1(length
	 * of the string). So you can use substring(1, string.length()-1).
	 * 
	 * 4. The substring() method will return an empty String if beginIndex=
	 * endIndex.
	 * 
	 * 5. The substring() method will throw StringIndexOutOfBoundsException, If
	 * beginIndex < 0 or beginIndex >= lengthOfString endIndex <0 or endIndex <
	 * beginIndex or endIndex >= lengthOfString
	 */
}

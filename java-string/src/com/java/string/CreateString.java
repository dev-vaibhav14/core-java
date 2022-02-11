package com.java.string;

import java.nio.charset.Charset;

public class CreateString {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
			String str = "vaibhav";
			System.out.println(str);
			
			String name = new String("vaibhav");
			Charset charset = Charset.forName("UTF-8");
			byte [] bArr =  {1,2,3};
			String name2 = new String(bArr , charset);
			System.out.println(name2);  // generated using default charset 
			
	}

}

package com.supriya.examples3;

public class ExceptionHandlingExample1 {

	public static void main(String[] args) {
		try
		{
			int a = 50/0;
			System.out.println(a);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
System.out.println("rest of the code....");
	}

}

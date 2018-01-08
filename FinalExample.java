package com.Supriya.Examples;

public class FinalExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			int i = 50/5;
		
		}
		catch(ArithmeticException e)
		{
          System.out.println(e);
		}
		finally
		{
			System.out.println("Finally always executes....");
		}
		
		try
		{
			int j = 60/0;
		}
		catch(ArithmeticException e1)
		{
			System.out.println("cannot divide by zero");
		}
		finally 
		{
			System.out.println("Error");
		}
		System.out.println("running code......");
	}
	

}

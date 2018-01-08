package com.supriya.examples;

public class ConstructorExample {
	
	int id;
	String name;
	ConstructorExample()
	{
		System.out.println(id+ " " +name);
	}
	ConstructorExample(int a, String n)
	{
		id = a;
		name = n;
		
	}
   void display()
   {
	   System.out.println(id+ " " +name);
	  
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   ConstructorExample obj = new ConstructorExample(101,"Supriya");
   ConstructorExample obj1 = new ConstructorExample();
   obj.display();
   
	}

}

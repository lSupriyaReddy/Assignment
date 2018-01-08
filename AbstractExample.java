package com.supriya.examples3;

 abstract class AbstractExample {

	AbstractExample()
	{
		System.out.println("bike is created");
	}  
	   abstract void run();  
	   void changeGear()
	   {
		   System.out.println("gear changed");
	   }  
	 }  
	  
	 class Honda extends AbstractExample{  
	 void run(){System.out.println("running safely..");}  
	 }  
	 class TestAbstraction2{  
	 public static void main(String args[]){  
	 AbstractExample obj = new Honda();  
	  obj.run();  
	  obj.changeGear();  
	 }  
	  
	
	

}

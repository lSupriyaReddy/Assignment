package com.supriya.examples3;

public interface InterfaceExample {
	void draw();
	
}

class Rectangle implements InterfaceExample{  
public void draw(){System.out.println("drawing rectangle");}  
}  
class Circle implements InterfaceExample{  
public void draw(){System.out.println("drawing circle");}  
}  
  
class TestInterface1{  
public static void main(String args[]){  
InterfaceExample i = new Circle();
i.draw();  
}}  
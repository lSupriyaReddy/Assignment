package com.supriya.examples;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		
		ArrayList<String> obj = new ArrayList<String>();
		obj.add("Ravi");
		obj.add("Vijay");
		obj.add("Ramu");
		obj.add("Ajay");
		
		System.out.println("The elements in the arraylist = " + obj);
		
		obj.remove("Ramu");
		
		System.out.println("The elements in the arraylist modified = " + obj);
		

	}

}

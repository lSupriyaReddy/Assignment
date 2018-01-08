package com.supriya.examples3;

public class StringExample1 {
	public static void main(String args[]){  
		String s1="java";
		char ch[]={'s','t','r','i','n','g','s'};  
		String s2=new String(ch);
		String s3=new String("example");  
		System.out.println(s1);  
		System.out.println(s2);  
		System.out.println(s3);  
		
		String name="java";  
		char ch1 =name.charAt(3);  
		System.out.println(ch1);
		
		String name1 = "My name is ";
		System.out.println(name.concat("Supriya"));
		
		
		String s4 = "Java";
		System.out.println(s4.substring(2,3));
		
		String s5 = "My name is Khan";
		System.out.println(s5.replace("is", "was"));
		System.out.println(s5.toLowerCase());
		System.out.println(s5.toUpperCase());
		}
	

	}



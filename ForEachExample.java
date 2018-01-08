package com.supriya.examples;

public class ForEachExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int numbers[] = {1,2,3,10,5,6};
    int sum = 0;
    for(int num:numbers )
    {
    	sum += num;
    	System.out.println("Total sum is  = " + sum);
    }
	}

	

}

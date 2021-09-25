package com.arraytask;

public class ArrayMainClass 
{
	public static void main(String[] args) {
		 // call methods of ArraysWork class
		ArraysWork object=new ArraysWork();
		int repeatedValues[]=new int[10];
		repeatedValues=object.getRepeatedValues();
		System.out.println("Repeated values in the given array are: ");
		object.display(repeatedValues);
		
		short sumOfArray=object.getSum();
		System.out.println("Sum of the given array is:"+sumOfArray);
		
	}

}

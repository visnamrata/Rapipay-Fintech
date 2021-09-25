package com.arraytask;

public class ArraysWork {
int arr[] = {15,19,6,3,74,84,62,100,20,38,415,3,74,16,15,9,650,67};
	
	
	public int[] getRepeatedValues()
	{
		// code to return arr[] containing only duplicate values, such as 15,3 etc
		int size=arr.length;
		int idx=0;
		int repeatedValues[]=new int[size];
		for(int i = 0; i < arr.length; i++) 
		{  
            for(int j = i + 1; j < arr.length; j++) 
            {  
                if(arr[i] == arr[j])  
                {
                	repeatedValues[idx]=arr[j];
                	idx++;
                }
                          
            }
		}
            return repeatedValues;
	}       
	
	public short getSum()
	{
		// code to return the total of all values;
		short sumOfArray=0;
		for(int forSum:arr)
		{
			sumOfArray=(short)(sumOfArray+forSum);
		}
		return sumOfArray;
	}
	
	public int[] getUniqueValues()
	{
		// code to return arr[] containing all unique values only;
		int size=arr.length;
		int idx=0,j;
		int uniqueValues[]=new int[size];
		for (int i = 0; i < arr.length; i++) 
		{
	         for (j = 0; j < i; j++)
	        	 if (arr[i] == arr[j])
	 	            break;
	 	     if (i == j)
	 	     {
	 	        uniqueValues[idx]=arr[i];
	 	        idx++;
	 	     }
	        	 
	     }
	  return uniqueValues;  
		
		
	}
	
	public void display(int arrayTodisplay[])
			
	{
		for (int i : arrayTodisplay) 
		{
			System.out.println(i+" ");
		}
	}

}

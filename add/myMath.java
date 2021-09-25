package com.add;

public class myMath
{
	private int number1;
	private int number2;
	
	myMath(int number1,int number2)
	{
		this.number1=number1;
		this.number2=number2;
	}
    
	public void addTwoNumbers()
	{
		int result=number1+number2;
		System.out.println("Addition of the numbers is: "+result);
	}
}

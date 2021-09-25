package com.add;
import java.util.Scanner;

public class userInput 
{
	public static void main(String arg[])
	{
		takeUserInput();
	}
	
	public static void takeUserInput()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number one: ");
		int number1=sc.nextInt();
		System.out.println("Enter number two: ");
		
		int number2=sc.nextInt();
		
		myMath obj=new myMath(number1,number2);
		obj.addTwoNumbers();
		sc.close();
	}
	

}

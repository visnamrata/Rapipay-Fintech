package com.employee;
import java.util.Scanner;
public class UserModeForInterest 
{
	public static void main(String arg[])
	{
		userInput();
	}
	
	public static void userInput()
	{
		int deposit,years;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Intial deposit amount: ");
		deposit=sc.nextInt();
		System.out.println("Enter number of years: ");
		years=sc.nextInt();
		InterestCalculator server=new InterestCalculator(deposit,years);
		server.interestCalculator();
		sc.close();
	}
}


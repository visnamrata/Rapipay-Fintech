package com.employee;
import java.util.Scanner;


public class UserMode 
{
	public static void main(String arg[])
	{
		userInput();
		
		
	}
    public static void userInput()
    {
 
		int hr_reg;
		int hr_over;
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter regular hours: ");
		hr_reg=sc.nextInt();
		System.out.println("Enter overtime hours: ");
		hr_over=sc.nextInt();
		sc.close();
		Employee serverCode=new Employee(hr_reg,hr_over);
		serverCode.calculateSalary();
        
    }
}

package com.worker;

import java.util.Scanner;

public class WorkerMainClass 
{
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter number of hours hourly wages worker worked: ");
		int hours=sc.nextInt();
		
		HourlyWorker hw=new HourlyWorker();
		hw.computePay(hours);
		
		System.out.println("Enter number of hours salaried worker worked: ");
		int shours=sc.nextInt();
		
		SalariedWorker sw=new SalariedWorker();
		sw.computePay(shours);
		
		sc.close();
	}
	

}

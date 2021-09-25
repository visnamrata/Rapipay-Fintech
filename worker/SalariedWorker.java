package com.worker;

import java.util.Scanner;

public class SalariedWorker extends Worker
{
  private final int HOURS=40;
  private int salary;
  Scanner sc=new Scanner(System.in);
  
  public void computePay(int workedhours)
  {
	  System.out.println("Name whose salary is to be computed: ");
		String name=sc.nextLine();
		
		System.out.println("Enter salary rate: ");
		int salryRate=sc.nextInt();
		
		
		super.setSalryRate(salryRate);
		super.setWorkerName(name);
		
		salary=HOURS*super.getSalryRate();
		System.out.println("Salary of hourly wages worker "+super.getWorkerName()+ " is: "+salary*7);
  }	
}

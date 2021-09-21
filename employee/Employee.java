package com.employee;

public class Employee 
{
  float hr_pay=500;
  int hr_reg;
  int hr_over;
 
 public Employee(int hr_reg,int hr_over)
 {
	 this.hr_reg=hr_reg;
	 this.hr_over=hr_over;
 }
 public void calculateSalary()
 {
	 
	 double weeklySalary=(hr_reg*500)+(hr_over*1.5*500);
	 display(weeklySalary);
	 
 }
 
 public void display(double weeklySalary)
 {
	 System.out.println("Total weekly salary is: "+weeklySalary);
 }
}

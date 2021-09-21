package com.employee;

public class InterestCalculator 
{
 private int depositAmount;
 private int no_of_years;
 private int eligibleForInvestment;
 private int closingAmount;
 
 public InterestCalculator(int depositAmount,int no_of_years) {
	this.depositAmount=depositAmount;
	this.no_of_years=no_of_years;
	this.eligibleForInvestment=0;
	this.closingAmount=0;
	
}
 
 public void interestCalculator()
 {
	 for(int i=1;i<=no_of_years;++i)
	 {
		 System.out.println("FOR YEAR ");
		 System.out.println("--------------------"+i+"--------------");
		 
		 eligibleForInvestment=closingAmount+depositAmount;
		 System.out.println("Eligible amount for investment: "+eligibleForInvestment);
		 
		 int interest=(int)(eligibleForInvestment*0.09f);
		 System.out.println("Interest in eligibel amount: "+interest);
		 
		 closingAmount=eligibleForInvestment+interest;
		 System.out.println("Closing amount after interest applied: "+closingAmount);
		 
	 }
 }
}

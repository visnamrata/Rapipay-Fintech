import java.util.Scanner;
class TaxCalculator
{
   public static void main(String arg[])
   {
	   
	  Scanner sc = new Scanner(System.in);
	   
	System.out.print("Enter Salary :- ");
	int salary = sc.nextInt();
    	float tax = 1;
	int taxRate=0;
	float hra=salary*0.15f;
	System.out.println("HRA of the " +salary+ "Rs. is: "+hra);
	float da=salary*0.6f;
	System.out.println("DA of the " +salary+ "Rs. is: "+da);
	if(salary<500000)
	{  taxRate=0;
		tax = 0;
	}
	else if(salary>500001 && salary<1000000)
	{taxRate=20;
	  tax=salary*0.2f;
	}
	else
	{
	 taxRate=30;
	 tax=salary*0.3f;
	}
	
	System.out.print("For Salary "+salary+", Tax would be @ "+taxRate+" % amount "+tax+" Rs.");
	
   }
}
// Enter Basic Salary 
// add HRA :- @15 of Basic
// add DA :- 60% of Basic 
// tax : below 500k :- 0%'
// 500,001 - 10,00,000 :- 20%
// 10                  := 30%

//https://github.com/fsdtrinings/fsdSep21Training/tree/main

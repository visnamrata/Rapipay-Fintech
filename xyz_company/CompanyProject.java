package com.xyz_company;

public class CompanyProject 
{
  public static void main(String args[])
  {
	  CEO c=new CEO();
	  Manager m=new Manager();
	  
	  System.out.println(c.getRoleName());
	  System.out.println(c.getResponsibility());
	  System.out.println(m.getRoleName());
	  
	  System.out.println(m.getResponsibility());
	  
	  
  }
}

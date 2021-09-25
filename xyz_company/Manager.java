package com.xyz_company;

public class Manager implements Role
{
    
	Manager()
	{
		
	}
	@Override
	public String getRoleName() {
		String role="Manager";
		return role;
	}

	@Override
	public String getResponsibility() {
		String responsibility="Managing";
		return responsibility;
	}

}

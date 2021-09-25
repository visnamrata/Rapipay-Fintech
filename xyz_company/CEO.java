package com.xyz_company;

public class CEO implements Role 
{
	CEO()
	{
		
	}

	@Override
	public String getRoleName() {
		// TODO Auto-generated method stub
		String role="CEO";
		return role;
	}

	@Override
	public String getResponsibility() {
		// TODO Auto-generated method stub
		String responsibility="xyz";
		return responsibility;
	}

}

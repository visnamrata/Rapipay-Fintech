package com.array.Mobile;

public class MobilePhoneDatabase 
{
	long phoneNumbers[] = {
			9595959595L,
			7845959595L,
			8485959595L,
			9515459595L,
			9595959000L
	};
	     
	
	
	public long[] getAllPhoneNumbers()
	{
		return phoneNumbers; // B
		
	}
	
	// verify phone number in records
	public boolean verifyPhoneNumbers(long searchPhoneNumber) 
	{
		boolean isAvailable = false;
		
		
		for (int i = 0; i < phoneNumbers.length; i++) {
			if(phoneNumbers[i] == searchPhoneNumber)
			{
				isAvailable = true;
				static int idx=i;
				break;
			}
		}
		
		return isAvailable;
	}
	
	public boolean addPhoneNumber(long phoneNumber)
	{
		boolean isInserted = false;
		//code to store phone number in DB
		
		return isInserted ;
	}
	
	public boolean updatePhoneNumber(long newPhoneNumber,long oldPhoneNumber)
	{
		boolean isUpdated = false;
			if(verifyPhoneNumbers(oldPhoneNumber))
			{
				phoneNumbers[idx]=newPhoneNumber;
				isUpdated = true;
			}
		
		
		
		return isUpdated;
	} 
}

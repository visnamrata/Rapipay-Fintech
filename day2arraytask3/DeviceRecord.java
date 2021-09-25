package com.day2arraytask3;

public class DeviceRecord 
{
  Device deviceArray[]=new Device[500];
  int index=0;
  
  //method to add new device and it returns modelNumber of new device
  public String addDevice(Device d)
  {
	String insertedDevice = null;
  	if(d!=null)
  	{
  		deviceArray[index++]=d;
  		insertedDevice=d.getModelNumber();
  	}
  	return insertedDevice;
  }
  


public Device getDeviceByModelNumber(String searchModelNumber)
	{
		Device temp = null;
	
		// code to fetch device from Array(DB) based on Modelnumber otherwise return null;
		for (int i = 0; i < index; i++) 
		{
			if(deviceArray[i].getModelNumber()== searchModelNumber)
			{
				
				return deviceArray[i];
			}
		}
	 return temp;	
	}

public Device[] getAllDevices() {
	Device allDevices[] = new Device[index];
	for (int i = 0; i < index; i++) {
		allDevices[i] = deviceArray[i];
	}
	return allDevices;
}

public Device deviceInCostRange(int costHigh,int costLow)
{
	Device temp=null;
	for(int i=0;i<index;i++)
	{
		if(deviceArray[i].getCost()>=costLow && deviceArray[i].getCost()<=costHigh)
			temp= deviceArray[i];
	}
	return temp;
}



}






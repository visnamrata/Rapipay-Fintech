package com.day2arraytask3;
import java.util.Scanner;

public class DeviceMainClass 
{

	DeviceRecord record=new DeviceRecord();
	Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {
		DeviceMainClass dmc = new DeviceMainClass();
		
		while(true)
		{
			System.out.println(" ------- Device Operations ----");
			System.out.println("1. Add New Device ");
			System.out.println("2. Search Device based on ModelNumber ");
			System.out.println("3. Print All Devices ");
			System.out.println("4. Print Devices within Price Range ");
			System.out.println("5. Filter Device based on Price Range and BrandName ");
			System.out.println("6. Apply avgRating filter on Filtered Devices. ");
			System.out.println("0. EXIT ");
			
			System.out.println("\n\n Enter Choice :-  ");
			int userChoice = Integer.parseInt(dmc.sc.nextLine());
		
			
			switch (userChoice) {
			case 1:
				dmc.addDevice();
				break;
				
			case 2:
				dmc.getDeviceByModelNumber();
				break;
				
			case 3:
				dmc.getAllDevices();
				break;
				
			case 4:
				
				
				dmc.deviceInCostRange();
				break;
				
			case 6:
				System.out.println(" Not Implemented...");
				break;
				
				
				
			case 0:
				System.exit(0);
				break;
				
			

			default:
				break;
			}
		}
			
		}
		
		
		
		public void addDevice()
		{
			
			// take user input and submit
			
			System.out.println(" Enter Device Name ");
			String devName = sc.nextLine();
			
			System.out.println("Enter cost of the device ");
			int devCost = Integer.parseInt(sc.nextLine());
			
			System.out.println("Give the average rating for the device ");
			int devRating = Integer.parseInt(sc.nextLine());
			
			System.out.println(" Enter Device Brand Name ");
			String devBrand = sc.nextLine();
			
			
			
			Device newDevice = new Device(devName, devCost,devRating,devBrand);
			String modelNumber = record.addDevice(newDevice);
			
			System.out.println(" Device Inserted :- "+modelNumber);
		}
		
		
		//search device on model number
		public void getDeviceByModelNumber()
		{
			System.out.println("Enter Model number  ");
			String searchModelNumber = sc.nextLine();
			
			Device d = record.getDeviceByModelNumber(searchModelNumber);
			printDeviceDetails(d);
		}
		
		
		public void getAllDevices()
		{
			Device arr[] = record.getAllDevices();
			for (Device device : arr) {
				printDeviceDetails(device);
			}
		}
		
		
		
		public void deviceInCostRange()
		{
			System.out.println("Enter high price in range: ");
			int highPrice=Integer.parseInt(sc.nextLine());
			
			System.out.println("Enter low price in range: ");
			int lowPrice=Integer.parseInt(sc.nextLine());
			
			Device d=record.deviceInCostRange(highPrice,lowPrice);
			
			printDeviceDetails(d);
			
		}
		
		//print device details
		public void printDeviceDetails(Device device)
		{
			System.out.println(device.toString());
			System.out.println("-------------------------------------------");
		}
		
	
}

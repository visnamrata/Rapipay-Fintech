package com.day2arraytask3;
import java.util.Random;

public class Device 
{
	private String deviceName;
	private String modelNumber; 
	private int cost;
	private int avgRating;
    private String brandName;
	Random random=new Random();
	public Device(String deviceName, int cost, int avgRating,String brandName) {
		this.deviceName = deviceName;
		this.cost = cost;
		this.avgRating = avgRating;
		this.brandName = brandName;
		for(int i=0;i<6;++i)
			this.modelNumber+=(random.nextInt(122)+'a');
	}

	public String getDeviceName() {
		return deviceName;
	}

	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}

	public String getModelNumber() {
		return modelNumber;
	}

	public void setModelNumber(String modelNumber) {
		this.modelNumber = modelNumber;
	}

	public int getCost() 
	{
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public int getAvgRating() {
		return avgRating;
	}

	public void setAvgRating(int avgRating) {
		this.avgRating = avgRating;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	} 
	
	public String toString()
	{
		return brandName+" "+cost+" "+avgRating+" "+deviceName+" "+modelNumber;
	}
	

}

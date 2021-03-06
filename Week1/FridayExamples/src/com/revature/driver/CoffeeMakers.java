package com.revature.driver;

import java.util.Comparator;

//CofferMakers implements Comparable
//SO that we can compare coffee makers to each other
public class CoffeeMakers implements Comparable<CoffeeMakers>{

	private int capacity;
	
	private double completionTime;
	
	private String brand;
	
	@Override
	public String toString() {
		return "CoffeeMakers [capacity=" + capacity + ", completionTime=" + completionTime + ", brand=" + brand + "]";
	}

	public CoffeeMakers() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CoffeeMakers(int capacity, double completionTime, String brand) {
		super();
		this.capacity = capacity;
		this.completionTime = completionTime;
		this.brand = brand;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public double getCompletionTime() {
		return completionTime;
	}

	public void setCompletionTime(double completionTime) {
		this.completionTime = completionTime;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	//Comparable has one method, compareTo, that must be implemented
	//return positive if your coffee maker is better
	//negative if worse
	//and zero if the same
	@Override
	public int compareTo(CoffeeMakers arg0) {
		
		if(this.capacity == arg0.getCapacity() 
				&& this.completionTime == arg0.getCompletionTime() 
				&& this.brand.equals(arg0.getBrand())){
			
			return 0;
			
		}
		
		else if(this.capacity > arg0.getCapacity()){
			
			return 1;
			
		}
		
		else if(this.capacity < arg0.getCapacity()){
			
			return -1;
			
		}
		
		else if(this.completionTime < arg0.getCompletionTime()){
			
			return 1;
			
		}
		
		else if(this.completionTime > arg0.getCompletionTime()){
			
			return -1;
			
		}
		
		return this.brand.compareTo(arg0.getBrand());
		
	}
	
	static class CompareCoffeeByTime implements Comparator<CoffeeMakers>{

		@Override
		public int compare(CoffeeMakers arg0, CoffeeMakers arg1) {
			if(arg0.getCompletionTime() > arg1.getCompletionTime()){
				
				return 1;
				
			}
			
			else if(arg0.getCompletionTime() < arg1.getCompletionTime()){
				
				return -1;
				
			}
			
			return arg0.getBrand().compareTo(arg1.getBrand());
		}
		
		
		
	}

}

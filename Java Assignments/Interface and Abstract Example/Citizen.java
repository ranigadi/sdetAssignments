package com.qa.car;

public class Citizen extends Car{
	
	int cid;

	
	public int power(int x) {
		x=x*100;
		return x;
	}

	@Override
	public void test() {
		System.out.println("test run");
		
	}

	@Override
	public void speed() {
		System.out.println("speed is" );
	}
	
	public static void main(String args[])
	{
		Citizen c = new Citizen();
		c.cid= 2014;
		c.carBrand="swift";
		c.carPrice=800000.99;
		System.out.println("Citizen with cid "+c.cid+" is having "+ c.carBrand + "car worth price" + c.carPrice +".");
		
	}

}
package com.daytwo;

public class Driver {
	String name;
	//Car c;
	Car c;
	public Driver(String name,Car c) {
		this.name=name;
		this.c=c;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Car getC() {
		return c;
	}
	public void setC(Car c) {
		this.c = c;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c=new Car(4545,"BMW",new java.util.Date(System.currentTimeMillis()));
		Driver d=new Driver("Akshay",c);
		System.out.println("Driver name is :"+d.getName()+"\n"+"Car Name is :"+d.getC().purchase_date);
	}
}

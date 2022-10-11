package com.dayone;

public class Cricketer {
	String name;
	String color;
	String state;
	String country;
	String role;
	int age;
	public Cricketer(String name, String color, String state, String country,String role, int Age) {
		this.name=name;
		this.color=color;
		this.state=state;
		this.country=country;
		this.role=role;
		this.age=Age;
		
	}
	void show() {
		System.out.println(this.name+" is a "+this.role);
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cricketer MSD=new Cricketer("Mahendra Singh Dhoni","Brown","Jharkhand","India","Wicket-Keeper",38);
		MSD.show();
	}

}

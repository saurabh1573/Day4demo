package com.dayone;

public class MethodOverloadingDemo {
	public void contact(String name,long number1) {
		System.out.println("Name is:"+name);
		System.out.println("Num1 is:"+number1);
	}
	public void contact(String name,long number1,long number2) {
		System.out.println("Name is:"+name);
		System.out.println("Num1 is:"+number1);
		System.out.println("Num2 is:"+number2);
	}
	

}

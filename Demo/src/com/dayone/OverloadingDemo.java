package com.dayone;
import java.util.Scanner;
public class OverloadingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name");
		String name=sc.next();
		System.out.println("Enter num1");
		long num1=sc.nextLong();
		System.out.println("Enter num2");
		long num2=sc.nextLong();
		MethodOverloadingDemo emp=new MethodOverloadingDemo();
		emp.contact(name,num1);
		emp.contact(name,num1,num2);
	}

}

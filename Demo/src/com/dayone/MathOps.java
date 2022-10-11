package com.dayone;
import java.util.*;
public class MathOps {
	static double a=31;
	static double b=60;
	//static double c=10;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Year to Check :");
		int year=sc.nextInt();
		if((year % 100==0 && year%400==0)) {
			System.out.println("It is a leap year");
		}
		else if(year%100==0) {
			System.out.println("It is not a leap year");
		}
		else if(year%4==0) {
			System.out.println("It is a leap year");
		}
		else {
			System.out.println("It is not a leap year");
		}
	
	}

}

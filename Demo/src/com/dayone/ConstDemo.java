package com.dayone;
import java.util.*;
public class ConstDemo {
	double Area;
	double radious;
	final double pi=3.14;
	double display() {
		Area=pi*Math.pow(radious, 2);
		System.out.println("Area of Circle : "+Area);
		return Area;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstDemo cd=new ConstDemo();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the radious :");
		cd.radious=sc.nextInt();
		double x=cd.display();
	}

}

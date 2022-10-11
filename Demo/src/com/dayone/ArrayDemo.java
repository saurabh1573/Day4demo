package com.dayone;
import java.util.Scanner;
public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the length:");
		int len=sc.nextInt();
		int x[]=new int[len+1];
		int k;
		for(k=0;k<len;k++) {
			System.out.println("Enter the element you want to insert:");
			x[k]=sc.nextInt();
		}
		System.out.println("Enter the element you want to insert:");
		x[k]=sc.nextInt();
		for(int i=0;i<len+1;i++) {
			System.out.println(x[i]);
		}
		
	}

}

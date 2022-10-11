package com.daytwo;

public class StringBuilderDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb=new StringBuilder("Accenture");
		System.out.println(sb.insert(0, "ATCI "));
		System.out.println(sb.append("new"));
		System.out.println(sb.reverse());
		
		System.out.println(sb.replace(0, 3, ""));
		System.out.println(sb.delete(0, 3));
		System.out.println(sb.capacity());
		sb.ensureCapacity(30);
		System.out.println(sb.capacity());
	}

}

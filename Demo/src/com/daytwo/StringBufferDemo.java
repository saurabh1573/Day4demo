package com.daytwo;

public class StringBufferDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb=new StringBuffer("Accenture");
		System.out.println(sb.insert(0, "ATCI "));
		System.out.println(sb.reverse());
		
		System.out.println(sb.replace(0, 3, ""));
		System.out.println(sb.delete(0, 3));
		System.out.println(sb.capacity());
		sb.ensureCapacity(30);
		System.out.println(sb.capacity());
		System.out.pri
	}

}

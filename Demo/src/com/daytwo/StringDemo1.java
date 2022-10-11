package com.daytwo;

public class StringDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int len1,len2;
		String name="Saurabh";
		String surname="Kumar";
		len1=name.length();
		len2=surname.length();
		System.out.println("Length of name is "+len1+" and surname starts with "+surname.charAt(0));
		System.out.println(name.substring(1, 5));
		System.out.println(name.concat(" ").concat(surname));
		System.out.println(name.endsWith("h"));
		System.out.println(surname.indexOf('h'));
		System.out.println(surname.indexOf("uma"));
		System.out.println(name.equals(surname));
		System.out.println(name.toUpperCase());
		System.out.println(name.compareTo(surname));
		System.out.println(surname.toLowerCase());
		System.out.println("  Vishal #  ".trim());
		System.out.println(name.replace('a', ' '));
	}

}

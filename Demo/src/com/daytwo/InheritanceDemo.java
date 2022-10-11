package com.daytwo;

public class InheritanceDemo implements Trainer1,Trainer2{
	public void set1() {
		System.out.println("100");
	}
	public void set(int x) {
		System.out.println((int)Math.pow(x,3));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Trainer1 t=new InheritanceDemo();
		t.set(8);	}

}

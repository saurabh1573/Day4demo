package com.acc.lkm.keywords;

final public class test1 extends test{
	public test1(int age) {
		super(age);
	}
	void show() {
		System.out.println(super.age);
	}
	void set() {
		super.age=20;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test1 t=new test1(10);
		//t.set();
		t.show();
	}

}

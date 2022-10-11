package com.daytwo;

public class Father {
	String name;
	Daughter d;
	public Father(String name,Daughter d) {
		super();
		this.name=name;
		this.d=d;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Daughter getD() {
		return d;
	}

	public void setD(Daughter d) {
		this.d = d;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Daughter d=new Daughter("Varsha",25);
		Father p=new Father("Mahesh",d);
		System.out.println("Father's name is "+p.getName()+"\n"+"Daughter's name is "+p.getD().getName());

	}

}

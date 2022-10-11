package com.acc.lkm.keywords;

public class Staticdemo1 {
	int eid;
	String name;
	static String dept,company;
	public Staticdemo1(int eid,String name){//String dept,String company) {
		this.eid=eid;
		this.name=name;
		//this.dept=dept;
		System.out.println(eid+" "+name+" "+company+" "+dept);
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public static String getDept() {
		return dept;
	}
	public static void setDept(String dept) {
		Staticdemo1.dept = dept;
	}
	public static String getCompany() {
		return company;
	}
	public static void setCompany(String company) {
		Staticdemo1.company = company;
	}
	static class A{
		void paint() {
			System.out.println("Nested");
		}
		static void run() {
			System.out.println("Running");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Staticdemo1.setDept("JAVA");
		Staticdemo1.setCompany("Accenture");
		Staticdemo1 s1=new Staticdemo1(45,"Aniket");
		Staticdemo1 s2=new Staticdemo1(46,"Anubhav");
		
		Staticdemo1.setDept("Salesforce");
		Staticdemo1 s3=new Staticdemo1(47,"Mark");
		Staticdemo1.A.run();
		Staticdemo1.A  p=new Staticdemo1.A();
		p.paint();
		}

}


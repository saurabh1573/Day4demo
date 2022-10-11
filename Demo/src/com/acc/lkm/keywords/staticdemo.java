package com.acc.lkm.keywords;

public class Staticdemo {
	int eid;
	String name;
	static String dept,company;
	public Staticdemo(int eid,String name){//String dept,String company) {
		this.eid=eid;
		this.name=name;
		//this.dept=dept;
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
		Staticdemo.dept = dept;
	}
	public static String getCompany() {
		return company;
	}
	public static void setCompany(String company) {
		Staticdemo.company = company;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Staticdemo.setDept("JAVA");
		Staticdemo.setCompany("Accenture);
		Staticdemo s1=new Staticdemo()
	}

}

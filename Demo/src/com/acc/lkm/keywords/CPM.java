package com.acc.lkm.keywords;

public class CPM extends CompliTimePM{
	void sho() {
	System.out.println("In Cpm class");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CompliTimePM cpm=new CompliTimePM();
		cpm.Compile("Amit", "Java Developer");
		cpm.Compile("Vikash", "Dot Net Developer", "DBA");
		CompliTimePM cp=new CPM();
		cp.setName("Arun");
		cp.setRole1("Web Developer");
		CPM c=(CPM)cp;
		c.sho();
	}

}

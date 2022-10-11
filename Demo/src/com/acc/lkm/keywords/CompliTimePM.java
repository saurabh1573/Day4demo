package com.acc.lkm.keywords;

public class CompliTimePM {
	String name;
	String role1;
	String role2;
	public void Compile(String name,String role1) {
		this.name=name;
		this.role1=role1;
	}
	public void Compile(String name,String role1,String role2) {
		this.name=name;
		this.role1=role1;
		this.role2=role2;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRole1() {
		return role1;
	}
	public void setRole1(String role1) {
		this.role1 = role1;
	}
	public String getRole2() {
		return role2;
	}
	public void setRole2(String role2) {
		this.role2 = role2;
	}
}

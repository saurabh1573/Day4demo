package com.acc.lkm.keywords;

public class ThisDemo {
	int EID;
	String Enterprise_id,name;
	public ThisDemo(int eid,String entid) {
		this.EID=eid;
		this.Enterprise_id=entid;
		System.out.println(EID+"\n"+Enterprise_id);
	}
	public ThisDemo(int eid,String entid,String name) {
		this(eid,entid);
		//System.out.println(EID+"\n"+Enterprise_id);
		this.name=name;
		System.out.println(EID+"\n"+Enterprise_id+"\n"+name);
	}
	
}

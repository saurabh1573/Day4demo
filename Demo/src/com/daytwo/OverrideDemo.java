package com.daytwo;

public class OverrideDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SBI s=new SBI();
		Axis a=new Axis();
		HDFC h=new HDFC();
		System.out.println("ROI OF SBI"+s.roi(7)+"\n"+"ROI OF AXIS"+a.roi(8)+"\n"+"ROI OF HDFC"+h.roi(9));

	}

}

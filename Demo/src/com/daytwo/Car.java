package com.daytwo;
import java.util.Date;
public class Car {
	int number;
	String car_name;
	Date purchase_date;
	public Car(int number,String car_name,Date p_date) {
		this.number=number;
		this.car_name=car_name;
		this.purchase_date=p_date;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getCar_name() {
		return car_name;
	}
	public void setCar_name(String car_name) {
		this.car_name = car_name;
	}
	public Date getPurchase_date() {
		return purchase_date;
	}
	public void setPurchase_date(Date purchase_date) {
		this.purchase_date = purchase_date;
	}
	

}

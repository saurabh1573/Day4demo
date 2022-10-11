package com.acc.lkm.abstraction;
import java.util.Date;
public abstract class Department {

	void requirement(int proj_id) {
		System.out.println(proj_id);
	}
	abstract Date delivery_date(Date date);
}

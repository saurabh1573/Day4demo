package com.daytwo;

public interface Trainer1 {
	void set(int x);
	default void disp() {
		System.out.println("Trainer1");
	}
}

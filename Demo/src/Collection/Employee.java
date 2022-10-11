package Collection;

import java.util.*;

public class Employee implements Comparable<Employee> {
	private int id;
	private String name;
	private double salary;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	@Override
	public int compareTo(Employee obj1) {
		return (int)(this.salary-obj1.getSalary());
		//if(obj1.getSalary()<this.getSalary()) {
			//return -1;
	}
	@Override
	public String toString() {
		return this.id+" "+this.name+" "+this.salary;
	}
}

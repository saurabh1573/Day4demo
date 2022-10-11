package com.acc1.lkm.ActivityB;
import com.acc.lkm.ActivityA.Employee;
import java.util.Scanner;
public class EmpDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp=new Employee();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Employee ID:");
		int id=sc.nextInt();
		System.out.println("Enter Age:");
		int age=sc.nextInt();
		System.out.println("Enter Salary:");
		double salary=sc.nextDouble();
		System.out.println("Enter Variable pay:");
		double variablePay=sc.nextDouble();
		emp.setEmployeeID(id);
		emp.setAge(age);
		emp.setSalary(salary);
		emp.setVariablePay(variablePay);
		System.out.println("Employee Id:"+emp.getEmployeeID());
		System.out.println("Employee Age:"+emp.getAge());
		System.out.println("Employee Salary:"+emp.getSalary());
		System.out.println("Employee Variable Pay:"+emp.getVariablePay());
	}

}

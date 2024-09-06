package org.emp;

import java.util.Scanner;

class Employee{
	
	int empId;
	String name;
	String address;
	Scanner sc = new Scanner(System.in);
	
	void acceptRecord() {
		
		System.out.print("Employee ID : ");
		empId = sc.nextInt();
		
		System.out.print("Name : ");
		name = sc.nextLine();
		
		sc.nextLine();
		
		System.out.print("Address : ");
		address = sc.nextLine();
		
		sc.nextLine();
	}
	
	void display() {
		System.out.println("Employee ID : "+empId);
		System.out.println("Name : "+name);
		System.out.println("Address"+address);
	}
}

public class details {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp = new Employee();
		
		emp.acceptRecord();
		emp.display();
		
	}

}

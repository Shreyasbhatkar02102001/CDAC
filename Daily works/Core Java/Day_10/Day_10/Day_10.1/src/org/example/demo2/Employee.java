package org.example.demo2;


public class Employee extends Person{
	private int empid;
	private float salary;
	
	public Employee() {
		this.empid = 0;
		this.salary = 0.0f;
	}
	
	public Employee(String name, int age , int empid, float salary) {
		super( name, age );
		this.empid = empid;
		this.salary = salary;
	}
	
	public void displayRecord( ) {
		super.showRecord();
		System.out.println("Empid	:	"+this.empid);
		System.out.println("Salary	:	"+this.salary);
	}
}
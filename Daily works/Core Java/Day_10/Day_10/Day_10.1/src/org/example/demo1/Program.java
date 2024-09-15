package org.example.demo1;

class Person{
	private String name;
	private int age;
	
	public Person( ) {
		this.name = "";
		this.age = 0;
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void printRecord( ) {
		System.out.println("Name	:	"+this.name);
		System.out.println("Age	:	"+this.age);
	}
	
	@Override
	public String toString() {
		return this.name+"	"+this.age;
	}
}

class Employee extends Person{
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
	
	@Override
	public void printRecord( ) {
		super.printRecord();
		System.out.println("Empid	:	"+this.empid);
		System.out.println("Salary	:	"+this.salary);
	}
	@Override
	public String toString() {
		return  super.toString()+"	"+this.empid+"	"+this.salary;
	}
}

public class Program {
	public static void main(String[] args) {
		Employee emp = new Employee("Sandeep",40, 33, 45000.50f );
		//emp.printRecord();
		System.out.println( emp.toString() );
	}
}

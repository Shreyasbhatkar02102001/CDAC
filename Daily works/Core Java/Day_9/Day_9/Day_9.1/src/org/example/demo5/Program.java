package org.example.demo5;

class Person{	//Parent class / Super class
	String name;
	int age;

	public Person() {
		this.name = "";
		this.age = 0;
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void showRecord( ) {
		System.out.println("Name	:	"+this.name);
		System.out.println("Age	:	"+this.age);
	}
}

class Employee extends Person{	//Child class :  Sub class
	int empid;
	float salary;
	
	public Employee() {
		super();
		this.empid = 0;
		this.salary = 0.0f;
	}

	public Employee(int empid, float salary) {
		super();
		this.empid = empid;
		this.salary = salary;
	}
	
	public Employee(String name, int age, int empid, float salary) {
		super( name, age );	//Constructor Chaining: Constructor call must be the first statement in a constructor
		this.empid = empid;
		this.salary = salary;
	}
	
	public void displayRecord( ) {
		System.out.println("Empid	:	"+this.empid);
		System.out.println("Salary	:	"+this.salary);
	}
}
public class Program {
	public static void main(String[] args) {
		//Employee emp1 = new Employee();
		
		//Employee emp2 = new Employee(33, 45000.50f );
		
		Employee emp3 = new Employee("Sandeep", 40, 33, 45000.50f );
	}
	public static void main1(String[] args) {
		Person p1 = new Person();
		
		Person p2 = new Person("Sandeep", 40 );
	}
}

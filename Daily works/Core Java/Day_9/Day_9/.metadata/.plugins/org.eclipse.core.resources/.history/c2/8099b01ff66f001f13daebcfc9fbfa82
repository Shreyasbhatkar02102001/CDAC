package org.example.demo4;

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
	public static void f1( ) {
		System.out.println("Inside Super class f1");
	}
}

class Employee extends Person{	//Child class :  Sub class
	int empid;
	float salary;
	
	public Employee() {
		this.empid = 0;
		this.salary = 0.0f;
	}

	public Employee(int empid, float salary) {
		this.empid = empid;
		this.salary = salary;
	}
	
	public void displayRecord( ) {
		System.out.println("Empid	:	"+this.empid);
		System.out.println("Salary	:	"+this.salary);
	}
	public static void f2( ) {
		System.out.println("Inside Sub class f2");
	}
}
public class Program {
	public static void main(String[] args) {
		Employee.f1();//OK
		Employee.f2();//OK
	}
	public static void main3(String[] args) {
		Person.f1();//OK
		//Person.f2();//Not OK: The method f2() is undefined for the type Person
	}
	public static void main2(String[] args) {
		Employee emp = new Employee();
		emp.showRecord();	//OK
		emp.displayRecord();//OK
	}
	public static void main1(String[] args) {
		Person p = new Person();
		p.showRecord();//OK
		//p.displayRecord();	//Not OK: The method displayRecord() is undefined for the type Person
	}
}

package org.example.demo3;

class Person{	//Parent class / Super class
	String name;
	int age;
	static int personCount = 100;
	
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
	static int employeeCount = 200;
	
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
}
public class Program {
	public static void main(String[] args) {
		System.out.println("Count	:	"+Employee.personCount);	//Ok
		System.out.println("Count	:	"+Employee.employeeCount);	//Ok
	}
	public static void main3(String[] args) {
		System.out.println("Count	:	"+Person.personCount);	//OK
		//System.out.println("Count	:	"+Person.employeeCount);	//Not OK: employeeCount cannot be resolved or is not a field
	}
	public static void main2(String[] args) {
		 Employee emp = new Employee();
		 emp.name = "Sandeep";	//OK
		 emp.age = 40;	//OK
		 emp.empid = 33;	//OK
		 emp.salary = 45000.50f;	//OK
	}
	public static void main1(String[] args) {
		Person p = new Person();
		p.name  = "Sandeep";	//OK
		p.age = 40;	//OK
		//p.empid = 33;	//Not OK: empid cannot be resolved or is not a field
		//p.salary = 45000.50f;	//Not OK: salary cannot be resolved or is not a field
		
	}
}

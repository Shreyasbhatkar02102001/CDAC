package org.example.demo2;
public class Program {
	public static void main(String[] args) {
		Person p1 = null;	//OK
		Person p2 = new Person();	//OK
		Person p3 = new Employee();	//OK
		Employee emp1 = null;	//OK
		Employee emp2 = new Employee();	//OK
		//Employee emp3 = new Person();	//Not OK
	}
	public static void main8(String[] args) {
	//	Employee emp = new Person();	//Not OK
		Employee emp = (Employee)new Person();	//ClassCastException
	}
	public static void main7(String[] args) {
		Person p = new Person();
		//Employee emp = p; //Type mismatch: cannot convert from Person to Employee
		Employee emp = ( Employee ) p;	//ClassCastException
	}
	public static void main6(String[] args) {
		Person p = new Employee();	//OK
	}
	public static void main5(String[] args) {
		Employee emp = new Employee();	//OK
		Person p = emp;	//OK
	}
	public static void main4(String[] args) {
		Employee emp1 = new Employee();
		Employee emp2 = emp1;
	}
	public static void main3(String[] args) {
		Employee emp1 = null;
		emp1 = new Employee();
	}
	public static void main2(String[] args) {
		Person p1 = new Person();
		Person p2 = p1;
	}
	public static void main1(String[] args) {
		Person p1 = null;
		p1 = new Person(); 
	}
}

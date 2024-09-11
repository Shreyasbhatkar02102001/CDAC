package org.example.demo1;
class Person{
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

public class Program {
	public static void main(String[] args) {
		//Person p = new Person();
		Person p = new Person("Abc",30);
		p.showRecord();
	}
}

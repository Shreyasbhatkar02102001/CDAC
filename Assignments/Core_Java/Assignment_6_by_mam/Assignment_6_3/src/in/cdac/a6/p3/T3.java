package in.cdac.a6.p3;

import java.util.Scanner;

/*
 *		Create a base class Animal with attributes like name, and methods like eat() and sleep(). 
 *		Create a subclass Dog that inherits from Animal and has an additional method bark(). 
 *		Write a program to demonstrate the use of inheritance by creating objects of Animal and Dog and calling their methods. 
 */

class Animal {
	String name;
	
	Animal (String name){
		this.name = "Scobby";
	}
	
	void eat(String s) {
		System.out.println(name + " is eating");
	}
	
	void sleep(String s) {
		System.out.println(name+ " is sleeping");
	}
}

class Dog extends Animal{
	
	Dog(String name){
		super(name);
	}
	
	void bark(String name) {
		System.out.println(name + " is barking");
	}
}
public class T3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter name : ");
		String name = sc.nextLine();
		Animal a1 = new Animal(name);
		a1.eat(name);
		a1.sleep(name);
		
		Dog d1 =new Dog(name);
		d1.eat(name);
		d1.sleep(name);
		d1.bark(name);
	}

}

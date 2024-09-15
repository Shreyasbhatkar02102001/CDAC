package org.example.demo4;

import java.util.Scanner;

class Shape{
	protected float area;
	public Shape() {
	}
	public float getArea() {
		return this.area;
	}
}
class Rectangle extends Shape{
	private float length;
	private float breadth;
	
	public Rectangle() {
	}
	public void setLength(float length) {
		this.length = length;
	}
	public void setBreadth(float breadth) {
		this.breadth = breadth;
	}
	public void calculateArea( ) {
		this.area = this.length * this.breadth;
	}
}

class Circle extends Shape{
	private float radius;
	
	public Circle() {
	}
	public void setRadius(float radius) {
		this.radius = radius;
	}
	public void calculateArea( ) {
		this.area = (float) (Math.PI * Math.pow(radius, 2));
	}
}
public class Program {
	private static Scanner sc = new Scanner(System.in);
	public static int menuList( ) {
		System.out.println("0.Exit");
		System.out.println("1.Rectangle");
		System.out.println("2.Circle");
		System.out.print("Enter choice	:	");
		return sc.nextInt();
	}
	public static void main(String[] args) {
		int choice;
		while( ( choice = Program.menuList( ) ) != 0 ) {
			switch( choice ) {
			case 1:
				Rectangle rect = new Rectangle();
				rect.setLength(10);
				rect.setBreadth(5);
				rect.calculateArea();
				System.out.println("Area	:	"+rect.getArea());
				break;
			case 2:
				Circle c = new Circle();
				c.setRadius(10);
				c.calculateArea();
				System.out.println("Area	:	"+c.getArea());
				break;
			}
		}
	}
}

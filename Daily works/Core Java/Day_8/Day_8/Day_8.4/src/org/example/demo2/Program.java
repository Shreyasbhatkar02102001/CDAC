package org.example.demo2;

enum Day{
	SUN( "Sunday");
	private String name;
	private Day( String name ) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
}
public class Program {
	public static void main(String[] args) {
		Day day = Day.SUN;
		System.out.println("Name	:	"+day.name());	//SUN
		System.out.println("Ordinal	:	"+day.ordinal());	//0
		System.out.println("Literal	:	"+day.getName());	//Sunday
	}
}

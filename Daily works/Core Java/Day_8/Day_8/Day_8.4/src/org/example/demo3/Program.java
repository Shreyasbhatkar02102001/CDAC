package org.example.demo3;

enum Day{
	SUN( "Sunday"), MON("Monday"), TUES("TuesDay");
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
		Day[] days = Day.values();
		for (Day day : days) {
			System.out.println(day.name()+"	"+day.ordinal()+"	"+day.getName());
		}
	}
	public static void main1(String[] args) {
		Day day = Day.SUN;
		System.out.println("Name	:	"+day.name());	//SUN
		System.out.println("Ordinal	:	"+day.ordinal());	//0
		System.out.println("Literal	:	"+day.getName());	//Sunday
	}
}

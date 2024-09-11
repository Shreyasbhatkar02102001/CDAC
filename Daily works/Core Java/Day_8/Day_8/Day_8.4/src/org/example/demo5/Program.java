package org.example.demo5;

enum Day{
	SUN( 1, "SunDay" ), MON( 2, "MonDay" ), TUES( 3, "TuesDay" );
	
	private int dayNumber;
	private String dayName;
	
	private Day( int dayNumber, String dayName) {
		this.dayNumber = dayNumber;
		this.dayName = dayName;
	}
	public int getDayNumber() {
		return dayNumber;
	}
	public String getDayName() {
		return dayName;
	}
}
public class Program {
	public static void main(String[] args) {
		Day[] days = Day.values();
		for (Day day : days) {
			System.out.println(day.name()+"	"+day.ordinal()+"	"+day.getDayNumber()+"	"+day.getDayName());
		}
	}
}

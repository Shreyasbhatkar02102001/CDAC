package org.example.demo6;

interface Printable{
	void print( );
}
enum Day implements Printable{
	SUN( 1, "SunDay" ), MON( "MonDay" ), TUES( 3 );
	
	private int dayNumber;
	private String dayName;
	private Day( int dayNumber) {
		this.dayNumber = dayNumber;
	}
	private Day(String dayName) {
		this.dayName = dayName;
	}
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
	@Override
	public void print() {
		System.out.println(this.name()+"	"+this.ordinal()+"	"+this.dayNumber+"	"+this.dayName);
	}
	@Override
	public String toString() {
		return this.name()+"	"+this.ordinal()+"	"+this.dayNumber+"	"+this.dayName;
	}
}


public class Program {
	public static void main(String[] args) {
		Day[] days = Day.values();
		for (Day day : days) {
			day.print();
		}
	}
	public static void main2(String[] args) {
		Day[] days = Day.values();
		for (Day day : days) {
			System.out.println( day.toString());
		}
	}
	public static void main1(String[] args) {
		Day[] days = Day.values();
		for (Day day : days) {
			System.out.println(day.name()+"	"+day.ordinal()+"	"+day.getDayNumber()+"	"+day.getDayName());
		}
	}
}

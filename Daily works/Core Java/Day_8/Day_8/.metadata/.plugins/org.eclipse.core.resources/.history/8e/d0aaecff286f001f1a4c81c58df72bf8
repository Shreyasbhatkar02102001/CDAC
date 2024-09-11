package org.example.demo4;

enum Day{
	SUN( 1 ), MON( 2 ), TUES( 3 );
	
	private int dayNumber;
	private Day( int dayNumber ) {
		this.dayNumber = dayNumber;
	}
	public int getDayNumber() {
		return dayNumber;
	}
}
public class Program {
	public static void main(String[] args) {
		Day[] days = Day.values();
		for (Day day : days) {
			System.out.println(day.name()+"	"+day.ordinal()+"	"+day.getDayNumber());
		}
	}
}

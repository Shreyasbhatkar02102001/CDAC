package org.example.demo1;

enum Color{
	RED,	//public static final Color RED 
	GREEN, 	//public static final Color GREEN
	BLUE	//public static final Color BLUE
}

public class Program {
	public static void main(String[] args) {
		String name = "pink";
		Color color = Color.valueOf(name.toUpperCase()); //IllegalArgumentException
		System.out.println(color.name()+"	"+color.ordinal());
	}
	
	public static void main7(String[] args) {
		String name = "red";
		Color color = Color.valueOf(name.toUpperCase());
		System.out.println(color.name()+"	"+color.ordinal());
	}
	
	public static void main6(String[] args) {
		String name = "RED";
		Color color = Color.valueOf(name);
		System.out.println(color.name()+"	"+color.ordinal());
	}
	
	public static void main5(String[] args) {
		Color[] colors = Color.values();
		for( Color color : colors ) {
			System.out.println(color.name()+"	"+color.ordinal());
		}
	}
	public static void main4(String[] args) {
		Color color = Color.RED;
		System.out.println(color.name());		//RED
		System.out.println( color.ordinal());	//0
		
		color = Color.GREEN;
		System.out.println(color.name());		//GREEN
		System.out.println( color.ordinal());	//1
		
		color = Color.BLUE;
		System.out.println(color.name());		//BLUE
		System.out.println( color.ordinal());	//2
	}
	
	public static void main3(String[] args) {
		Color color = Color.RED;
		System.out.println(color.name());		//RED
		System.out.println( color.ordinal());	//0
	}
	
	public static void main2(String[] args) {
		System.out.println( Color.RED.name());		//RED
		System.out.println( Color.RED.ordinal());	//0
	}
	
	public static void main1(String[] args) {
		System.out.println( Color.RED );	//RED
		System.out.println( Color.GREEN);	//GREEN
		System.out.println( Color.BLUE);	//BLUE
	}
}

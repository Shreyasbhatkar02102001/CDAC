package org.example.demo2;

public class Program {
	private static void sum( int... arr ) {	//variable argument method / variable arity method
		int result = 0;
		for( int element : arr ) {
			result = result + element;
		}
		System.out.println("Result	:	"+result);
	}
	
	public static void main(String[] args) {
		
		
		Program.sum( );
		
		Program.sum(10, 20);
		
		Program.sum(10, 20, 30);
		
		Program.sum(10, 20, 30, 40, 50);
		
		Program.sum(10, 20, 30, 40, 50, 60, 70);
		
		Program.sum(10, 20, 30, 40, 50, 60, 70, 80, 90, 100);
	}
}

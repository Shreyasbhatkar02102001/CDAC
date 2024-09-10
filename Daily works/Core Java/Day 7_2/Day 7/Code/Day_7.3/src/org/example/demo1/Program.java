package org.example.demo1;

public class Program {
	private static void sum( ) {
		int result = 0;
		System.out.println("Result	:	"+result);
	}
	private static void sum(int num1, int num2) {
		int result = num1 + num2 ;
		System.out.println("Result	:	"+result);
	}
	private static void sum(int num1, int num2, int num3) {
		int result = num1 + num2 + num3;
		System.out.println("Result	:	"+result);
	}
	private static void sum(int num1, int num2, int num3, int num4, int num5) {
		int result = num1 + num2 + num3 + num4 + num5;
		System.out.println("Result	:	"+result);
	}
	private static void sum(int num1, int num2, int num3, int num4, int num5, int num6, int num7) {
		int result = num1 + num2 + num3 + num4 + num5 + num6 + num7;
		System.out.println("Result	:	"+result);
	}
	private static void sum(int num1, int num2, int num3, int num4, int num5, int num6, int num7, int num8, int num9, int num10) {
		int result = num1 + num2 + num3 + num4 + num5 + num6 + num7 + num8 + num9 + num10;
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

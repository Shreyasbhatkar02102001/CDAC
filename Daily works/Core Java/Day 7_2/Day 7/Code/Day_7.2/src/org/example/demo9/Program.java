package org.example.demo9;

public class Program {
	private static void swap(int x, int y) {
		int temp = x;
		x = y;
		y = temp;
	}
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		
		Program.swap( a, b );
		
		System.out.println("a	:	"+a);	//10
		System.out.println("b	:	"+b);	//20
	}
}

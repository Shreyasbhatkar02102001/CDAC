package org.example.demo1;

import java.util.Scanner;

public class Program {
	private static Scanner sc = new Scanner(System.in);
	
	private static void acceptRecord(int[] arr) {
		for( int index = 0; index < arr.length; ++ index ) {
			System.out.print("Enter arr["+ index +"]	:	");
			arr[ index ] = sc.nextInt();
		}
	}
	
	private static void printRecord(int[] arr) {
		for( int index = 0; index < arr.length; ++ index )
			System.out.println(arr[ index ]);
	}
	
	public static void main(String[] args) {
		int[] arr = new int[ 3 ];
	
		Program.acceptRecord( arr );
		
		Program.printRecord( arr );	
	}
	
	public static void main6(String[] args) {
		int[] arr = new int[ 3 ];
	
		for( int index = 0; index < arr.length; ++ index ) {
			System.out.print("Enter arr["+ index +"]	:	");
			arr[ index ] = sc.nextInt();
		}
		
		
		for( int index = 0; index < arr.length; ++ index )
			System.out.println(arr[ index ]);	
	}
	public static void main5(String[] args) {
		int[] arr = new int[ 3 ];
		arr[ 0 ] = 10;
		arr[ 1 ] = 20;
		arr[ 2 ] = 30;
		
		for( int index = 0; index < arr.length; ++ index )
			System.out.println(arr[ index ]);	
	}
	public static void main4(String[] args) {
		int[] arr = new int[ 3 ];
		for( int index = 0; index < arr.length; ++ index )
			System.out.println(arr[ index ]);	
	}
	public static void main3(String[] args) {
		int[] arr = new int[ 3 ];
		System.out.println(arr[ 0 ]);
		System.out.println(arr[ 1 ]);
		System.out.println(arr[ 2 ]);
	}
	public static void main2(String[] args) {
		int[] arr = new int[ -3 ]; //NegativeArraySizeException
	}
	public static void main1(String[] args) {
		//int arr[ ] = new int[ 3 ];	//OK
		
		//int [ arr ] = new int[ 3 ];	//Not OK
		
		int [ ]arr = new int[ 3 ];	//OK
	}
}

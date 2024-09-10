package org.example.demo2;

import java.util.Arrays;

public class Program {
	public static void main(String[] args) {
		int[] arr = new int[  ] { 10, 20, 30 };
		System.out.println( Arrays.toString(arr) );
	}
	public static void main6(String[] args) {
		int[] arr = new int[  ] { 10, 20, 30 };
		
		Arrays.stream( arr ).forEach(System.out::println);
	}
	public static void main5(String[] args) {
		int[] arr = new int[  ] { 10, 20, 30 };
		
		for( int element : arr ) {	//for-each loop ( it is also called as iterator in java)
			System.out.println( element);
		}
	}
	
	public static void main4(String[] args) {
		int[] arr = new int[  ] { 10, 20, 30 };
		
		for( int index = 0; index < arr.length; ++ index )
			System.out.println( arr[ index ] );
	}
	public static void main3(String[] args) {
		int[] arr = new int[  ] { 10, 20, 30 };
		
		int index = 0;
		while( index < arr.length ) {
			System.out.println(arr[ index ] ) ;
			 ++ index;
		}
	}
	public static void main2(String[] args) {
		int[] arr = new int[  ] { 10, 20, 30 };
		
		int index = 0;
		do {
			System.out.println(arr[ index ] ) ;
			 ++ index;
		}while( index < arr.length );
	}
	public static void main1(String[] args) {
		int[] arr = new int[  ] { 10, 20, 30 };
		
		//System.out.println( arr[ -1 ]);	//ArrayIndexOutOfBoundsException
		System.out.println( arr[ 0 ]);
		System.out.println( arr[ 1 ]);
		System.out.println( arr[ 2 ]);
		//System.out.println( arr[ 3 ]);	//ArrayIndexOutOfBoundsException
	}
}

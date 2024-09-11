package org.example.demo1;

import java.util.Arrays;
import java.util.Scanner;

public class Program {
	private static Scanner sc = new Scanner(System.in);
	
	public static int[][] getInstance( ){
		int[][] arr = new int[ 4 ][ ];
		arr[ 0 ] = new int[ 4 ];
		arr[ 1 ] = new int[ 3 ];
		arr[ 2 ] = new int[ 2 ];
		arr[ 3 ] = new int[ 5 ];
		return arr;
	}
	private static void acceptRecord(int[][] arr) {
		for( int row = 0; row < arr.length; ++ row ) {
			for( int col = 0; col < arr[ row ].length; ++ col ) {
				System.out.print("Enter arr["+ row +"]["+ col +"]	:	");
				arr[ row ][ col ] = sc.nextInt();
			}
		}
	}

	private static void printRecord(int[][] arr) {
		for( int row = 0; row < arr.length; ++ row ) {
			for( int col = 0; col < arr[ row ].length; ++ col ) {
				System.out.print(arr[ row ][ col ]+"	");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		int[][] arr = Program.getInstance();
		Program.acceptRecord( arr );
		Program.printRecord( arr );
	}

	public static void main3(String[] args) {
		int[][] arr = new int[ 4 ][ ];
		arr[ 0 ] = new int[ 4 ];
		arr[ 1 ] = new int[ 3 ];
		arr[ 2 ] = new int[ 2 ];
		arr[ 3 ] = new int[ 5 ];
		
		System.out.println( Arrays.deepToString(arr));	//[[0, 0, 0, 0], [0, 0, 0], [0, 0], [0, 0, 0, 0, 0]]
	}
	public static void main2(String[] args) {
		int[][] arr = new int[ 4 ][ ];
		System.out.println( Arrays.deepToString(arr));	//[null, null, null, null]
	}
	public static void main1(String[] args) {
		int arr1[][] = null;
		
		int[] arr2[] = null;
		
		int[][] arr3 = null;
	}
}

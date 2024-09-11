package org.example.demo2;

import java.util.Arrays;

public class Program {
	public static void main(String[] args) {
		int[][] arr = new int[][] { { 10, 20, 30 }, { 40, 50, 60 } };
		System.out.println( Arrays.deepToString(arr));//[[10, 20, 30], [40, 50, 60]]
	}
	public static void main4(String[] args) {
		int[][] arr = new int[][] { { 10, 20, 30 }, { 40, 50, 60 } };
		System.out.println( Arrays.toString(arr[ 0 ]));
		System.out.println( Arrays.toString(arr[ 1 ]));
		System.out.println("**********");
		for( int row = 0; row < arr.length; ++ row )
			System.out.println( Arrays.toString(arr[ row ]));
	}
	
	public static void main3(String[] args) {
		int[][] arr = new int[][] { { 10, 20, 30 }, { 40, 50, 60 } };
		System.out.println( arr.toString());	//[[I@1cf4f579
	}
	
	public static void main2(String[] args) {
		int[][] arr = new int[][] { { 10, 20, 30 }, { 40, 50, 60 } };
		for( int[] row : arr ) {
			for( int col : row ) {
				System.out.print( col +"	");
			}
			System.out.println();
		}
	}
	
	public static void main1(String[] args) {
		int[][] arr = new int[][] { { 10, 20, 30 }, { 40, 50, 60 } };
		for( int row = 0; row < arr.length; ++ row ) {
			for( int col = 0; col < arr[ row ].length; ++ col ) {
				System.out.print( arr[ row ][ col ]+"	");
			}
			System.out.println();
		}
	}
}

package org.example.demo1;

import java.util.Scanner;

class Array {
	private int[][] arr;
	public Array() {
		this(2, 3);
	}

	public Array(int row, int col) {
		this.arr = new int[row][col];
	}
	
	private static Scanner sc = new Scanner(System.in);
	public void acceptRecord( ) {
		for (int row = 0; row < this.arr.length; ++row) {
			for (int col = 0; col < this.arr[row].length; ++col) {
				System.out.print("Enter arr[" + row + "][" + col + "]	:	");
				this.arr[row][col] = sc.nextInt();
			}

		}
	}

	public void printRecord( ) {
		for (int row = 0; row < this.arr.length; ++row) {
			for (int col = 0; col < this.arr[row].length; ++col) {
				System.out.print(this.arr[row][col] + "	");
			}
			System.out.println();
		}
	}
	public static void releaseResource( ) {
		sc.close();
	}
}

public class Program {
	public static void main(String[] args) {
		Array a1 = new Array( 4, 4);
		a1.acceptRecord();
		a1.printRecord();
	}
	private static Scanner sc = new Scanner(System.in);

	private static void acceptRecord(int[][] arr) {
		for (int row = 0; row < arr.length; ++row) {
			for (int col = 0; col < arr[row].length; ++col) {
				System.out.print("Enter arr[" + row + "][" + col + "]	:	");
				arr[row][col] = sc.nextInt();
			}

		}
	}

	private static void printRecord(int[][] arr) {
		for (int row = 0; row < arr.length; ++row) {
			for (int col = 0; col < arr[row].length; ++col) {
				System.out.print(arr[row][col] + "	");
			}
			System.out.println();
		}
	}

	public static void main3(String[] args) {
		int[][] arr = new int[4][4];

		Program.acceptRecord(arr);

		Program.printRecord(arr);
	}

	public static void main2(String[] args) {
		int[][] arr = new int[4][4];

		for (int row = 0; row < arr.length; ++row) {
			for (int col = 0; col < arr[row].length; ++col) {
				System.out.print("Enter arr[" + row + "][" + col + "]	:	");
				arr[row][col] = sc.nextInt();
			}

		}

		for (int row = 0; row < arr.length; ++row) {
			for (int col = 0; col < arr[row].length; ++col) {
				System.out.print(arr[row][col] + "	");
			}
			System.out.println();
		}
	}

	public static void main1(String[] args) {
		int arr1[][] = null; // OK

		int[] arr2[] = null; // OK

		int[][] arr3 = null; // OK
	}
}

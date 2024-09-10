package org.example.demo4;

import java.util.Scanner;

class Array{
	private int[] arr;
	
	public Array( ) {
		this( 5 );
	}
	
	public Array( int size ) {
		this.arr = new int[ size ];
	}
	
	private static Scanner sc = new Scanner(System.in);
	public void acceptRecord() {
		for( int index = 0; index < this.arr.length; ++ index ) {
			System.out.print("Enter arr["+ index +"]	:	");
			this.arr[ index ] = sc.nextInt();
		}
	}

	public void printRecord() {
		for( int index = 0; index < this.arr.length; ++ index )
			System.out.println( this.arr[ index ]);
	}
	public static void releaseResource( ) {
		sc.close();
	}
}
public class Program {
	public static void main(String[] args) {
		Array a1 = new Array(  );
		
		a1.acceptRecord( );
		
		a1.printRecord( );
		
		Array.releaseResource();
	}
}

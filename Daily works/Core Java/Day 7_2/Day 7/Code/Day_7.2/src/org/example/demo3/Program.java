package org.example.demo3;

import java.util.Arrays;

public class Program {
	public static void main(String[] args) {
		boolean[] arr1 = new boolean[ 3 ];
		System.out.println( arr1.toString());	//[Z@1cf4f579
		
		byte[][] arr2 = new byte[ 2 ][ 2 ];
		System.out.println( arr2.toString());	//[[B@18769467
		
		short[][][] arr3 = new short[ 1 ][ 2 ][ 3];
		System.out.println( arr3.toString());	//[[[S@46ee7fe8
	}
	public static void main1(String[] args) {
		int[] arr1 = new int[ 3 ];
		System.out.println( arr1.toString());	//[I@1cf4f579
		
		int[][] arr2 = new int[ 2 ][ 2 ];
		System.out.println( arr2.toString());	//[[I@18769467
		
		int[][][] arr3 = new int[ 1 ][ 2 ][ 3];
		System.out.println( arr3.toString());	//[[[I@46ee7fe8
	}
}

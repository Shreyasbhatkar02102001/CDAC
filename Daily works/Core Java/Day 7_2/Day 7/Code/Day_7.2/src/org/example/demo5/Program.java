package org.example.demo5;

import java.util.Arrays;

public class Program {
	public static void main(String[] args) {
		int[] arr = new int[] { 50, 10, 40, 20, 30 };
		
		System.out.println( Arrays.toString(arr));
		
		Arrays.sort( arr );
		
		System.out.println( Arrays.toString(arr));
	}
}

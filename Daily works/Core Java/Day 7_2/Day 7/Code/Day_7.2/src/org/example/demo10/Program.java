package org.example.demo10;

import java.util.Arrays;

public class Program {
	public static void main(String[] args) {
		Object[] arr = new String[ 3 ];
		arr[ 0 ] = "C++";
		arr[ 1 ] = new String("Java");
		arr[ 2 ] = new StringBuffer("Python"); //ArrayStoreException
		
		System.out.println(  Arrays.toString(arr));	
	}
	public static void main2(String[] args) {
		Object[] arr = new String[ 3 ];
		arr[ 0 ] = "C++";
		arr[ 1 ] = "Java";
		arr[ 2 ] = "Python";
		
		System.out.println(  Arrays.toString(arr));	//[C++, Java, Python]
	}
	public static void main1(String[] args) {
		Object[] arr = new String[ 3 ];
		arr[ 0 ] = new String( "C++");
		arr[ 1 ] = new String( "Java");
		arr[ 2 ] = new String( "Python");
		
		System.out.println(  Arrays.toString(arr));	//[C++, Java, Python]
	}
}

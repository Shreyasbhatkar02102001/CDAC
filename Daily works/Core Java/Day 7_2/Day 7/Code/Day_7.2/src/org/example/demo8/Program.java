package org.example.demo8;

import java.util.Arrays;

class Complex{
	private int real;	//0
	private int imag;	//0
	
	public Complex() {
		//TODO
	}
	
	public Complex(int real, int imag) {
		this.real = real;
		this.imag = imag;
	}
	@Override
	public String toString() {
		return this.real+"	"+this.imag;
	}
}

public class Program {
	public static void main(String[] args) {
		//Array of Instance
		Complex[] arr = new Complex[ 3 ];
		for( int index = 0; index < arr.length; ++ index )
			arr[ index ] = new Complex();
				
		System.out.println( Arrays.toString(arr));	//[0	0, 0	0, 0	0]
	}
	public static void main1(String[] args) {
		//Array of Instance
		Complex[] arr = new Complex[ 3 ];
		arr[ 0 ] = new Complex();
		arr[ 1 ] = new Complex();
		arr[ 2 ] = new Complex();
		
		System.out.println( Arrays.toString(arr));	//[0	0, 0	0, 0	0]
	}
}

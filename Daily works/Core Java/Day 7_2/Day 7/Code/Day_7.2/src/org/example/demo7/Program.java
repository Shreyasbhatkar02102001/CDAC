package org.example.demo7;

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
		//Array of references
		Complex[] arr = new Complex[ 3 ];
		
		System.out.println( Arrays.toString(arr));	//[null, null, null]
	}
}

package org.example.demo2;

class Base{
	//reference
	private int num1;
	private int num2;
	public Base() {
		this.num1 = 10;
		this.num2 = 20;
	}
	
	public void printRecord( ) {
		System.out.println("Num1	:	"+this.num1);
		System.out.println("Num2	:	"+this.num2);
	}
}
class Derived extends Base{
	private int num3;

	public Derived() {
		this.num3 = 30;
	}
	@Override
	public void printRecord( ) {
		super.printRecord();
		System.out.println("Num3	:	"+this.num3);
	}
}

public class Program {
	public static void main(String[] args) {
		Base base = new Derived();	//Upcasting
		base.printRecord();	//Dynamic Method Dispatch
	}
	public static void main2(String[] args) {
		Derived derived = new  Derived();
		derived.printRecord();
	}
	public static void main1(String[] args) {
		Base base = new Base( );
		base.printRecord();
	}
}

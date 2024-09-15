package org.example.demo1;

class Base{
	private int num1;
	private int num2;
	public Base() {
		this.num1 = 0;
		this.num2 = 0;
	}
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	public void setNum2(int num2) {
		this.num2 = num2;
	}
	public void printRecord( ) {
		System.out.println("Num1	:	"+this.num1);
		System.out.println("Num2	:	"+this.num2);
	}
}
class Derived extends Base{
	private int num3;
	public Derived() {
		this.num3 = 0;
	}
	public void setNum3(int num3) {
		this.num3 = num3;
	}
	public void printRecord( ) {
		super.printRecord();
		System.out.println("Num3	:	"+this.num3);
	}
}
public class Program {
	public static void main(String[] args) {
		Base base = new Derived();//OK: Upcasting
		base.setNum1(10);	//OK
		base.setNum2(20);	//Ok
		//base.setNum3(30);	//The method setNum3(int) is undefined for the type Base
		Derived derived = (Derived) base;
		derived.setNum3(30);
		
		derived.printRecord();
	}
	public static void main3(String[] args) {
		Derived derived = new Derived();
		//Base base = ( Base )derived;	//OK: Upcasting
		Base base = derived;	//OK: Upcasting
	}
	public static void main2(String[] args) {
		Derived derived = new Derived();
		derived.printRecord();//0,0,0
		
		derived.setNum1(10);
		derived.setNum2(20);
		derived.setNum3(30);
		derived.printRecord();//10,20,30
	}
	public static void main1(String[] args) {
		Base base  = new Base();
		base.printRecord();	//0,0
		
		base.setNum1(10);
		base.setNum2(20);
		base.printRecord();//10, 20
	}
}

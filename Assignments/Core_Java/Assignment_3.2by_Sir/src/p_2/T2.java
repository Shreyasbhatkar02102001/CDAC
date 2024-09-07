package p_2;

import java.util.Scanner;

class CompoundInterestCalculator{
	int amount;
	float annualInterestRate;
	int numberOfCompounds;
	int years;
	double futureValue;
	double totalInterest;
	
	Scanner sc = new Scanner(System.in);
	
	void acceptRecord() {
		this.amount = sc.nextInt();
		this.annualInterestRate = sc.nextFloat()/100;
		this.numberOfCompounds = sc.nextInt();
		this.years = sc.nextInt();
	}
	
	double calculateFutureValue(){
		float a = (1 + annualInterestRate / numberOfCompounds);
		int b = (numberOfCompounds * years);
		futureValue = amount * Math.pow(a, b);
		totalInterest = futureValue - amount;
		return totalInterest;
	}
	
	void printRecord() {
		System.out.println("future value : "+ futureValue);
		System.out.println("total interest : "+ totalInterest);
	}
	
	
}

public class T2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CompoundInterestCalculator c1 =new CompoundInterestCalculator();
		c1.acceptRecord();
		c1.calculateFutureValue();
		c1.printRecord();

	}

}

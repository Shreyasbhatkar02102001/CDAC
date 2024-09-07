package p_2;

import java.util.Scanner;

class CompoundInterestCalculator{
	int amount;
	float annualInterestRate;
	int numberOfCompounds;
	int years;
	double futureValue;
	double totalInterest;
	
//	Scanner sc = new Scanner(System.in);
	
//	void acceptRecord() {
//		this.amount = sc.nextInt();
//		this.annualInterestRate = sc.nextFloat()/100;
//		this.numberOfCompounds = sc.nextInt();
//		this.years = sc.nextInt();
//	}
	
	
	
	double calculateFutureValue(){
		float a = (1 + annualInterestRate / numberOfCompounds);
		int b = (numberOfCompounds * years);
		futureValue = amount * Math.pow(a, b);
		totalInterest = futureValue - amount;
		return totalInterest;
	}
	
	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public float getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void setAnnualInterestRate(float annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}

	public int getNumberOfCompounds() {
		return numberOfCompounds;
	}

	public void setNumberOfCompounds(int numberOfCompounds) {
		this.numberOfCompounds = numberOfCompounds;
	}

	public int getYears() {
		return years;
	}

	public void setYears(int years) {
		this.years = years;
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
		//c1.acceptRecord();
		c1.calculateFutureValue();
		c1.printRecord();

	}

}

package p_1;

import java.util.Scanner;

class Amount{
	
	double amount;
	double interest_rate;
	double loan_term;
	//double principal;
	double numberOfMonths;
	double monthlyInterestRate;
	double totalAmountPaid;
	double monthlyPayment;
	
	
	Scanner sc = new Scanner(System.in);
	
	
	void acceptData(){
		System.out.println("Amount : ");
		amount = sc.nextDouble();
		
		System.out.println("Interst rate : ");
		interest_rate = sc.nextDouble();
		
		System.out.println("Loan term : ");
		loan_term = sc.nextDouble();
	}
	
	void calculate() {
		numberOfMonths= loan_term * 12;

		monthlyInterestRate = interest_rate / 12 / 100 ;
		monthlyPayment = amount * (monthlyInterestRate * Math.pow(1 + monthlyInterestRate, numberOfMonths))
                / (Math.pow(1 + monthlyInterestRate, numberOfMonths) - 1);
		totalAmountPaid = monthlyPayment * numberOfMonths;
	}
	
	void printRecord() {
        System.out.printf("Monthly Payment: ₹%.2f%n", monthlyPayment);
        System.out.printf("Total Amount Paid: ₹%.2f%n", totalAmountPaid);
    }
}

public class Loan_Amortization_Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Amount amt = new Amount();
		amt.acceptData();
		amt.calculate();
		amt.printRecord();

	}

}

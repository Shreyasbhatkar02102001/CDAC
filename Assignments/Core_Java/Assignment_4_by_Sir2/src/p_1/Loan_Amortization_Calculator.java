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
	
	
	
	
	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public double getInterest_rate() {
		return interest_rate;
	}

	public void setInterest_rate(double interest_rate) {
		this.interest_rate = interest_rate;
	}

	public double getLoan_term() {
		return loan_term;
	}

	public void setLoan_term(double loan_term) {
		this.loan_term = loan_term;
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
		//amt.acceptData();
		amt.calculate();
		amt.printRecord();

	}

}

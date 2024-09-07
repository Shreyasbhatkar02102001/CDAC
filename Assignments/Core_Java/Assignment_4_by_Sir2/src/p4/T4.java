package p4;

import java.util.Scanner;

class DiscountCalculator{
	int originalPrice;
	int discountRate ;
	float discountAmount;
	float finalPrice;
	
//	Scanner sc = new Scanner(System.in);
//	void acceptRecord() {
//		originalPrice = sc.nextInt();
//		discountRate = sc.nextInt();
//	}
	
	
	
	void calculateDiscount() {
		discountAmount = originalPrice * (discountRate / 100);
		finalPrice = originalPrice - discountAmount;
	}
	
	public int getOriginalPrice() {
		return originalPrice;
	}

	public void setOriginalPrice(int originalPrice) {
		this.originalPrice = originalPrice;
	}

	public int getDiscountRate() {
		return discountRate;
	}

	public void setDiscountRate(int discountRate) {
		this.discountRate = discountRate;
	}

	void printRecord () {
		System.out.println("Discount Amount : "+discountAmount);
		System.out.println("Final Price : "+finalPrice);
	}
}

public class T4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DiscountCalculator d1 = new DiscountCalculator();
		//d1.acceptRecord();
		d1.calculateDiscount();
		d1.printRecord();

	}

}

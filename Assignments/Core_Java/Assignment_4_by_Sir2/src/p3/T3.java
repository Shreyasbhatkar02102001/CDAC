package p3;

import java.util.Scanner;

class BMITracker{
	int height;
	int weight;
	int BMI;
	int n;
	
//	Scanner sc = new Scanner(System.in);
//	
//	void acceptRecord() {
//		height = sc.nextInt();
//		weight = sc.nextInt();
//	}
	
	public int getHeight() {
		return height;
	}
	
	public void setHeight(int height) {
		this.height = height;
	}
	
	
	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	int calculateBMI() {
		BMI = weight / (height * height);
		return BMI;
	}
	
	void classifyBMI () {
		if (BMI < 18.5) {
			n = 1;
		}
		else if (BMI >= 18.5 && BMI <24.9) {
			n = 2;
		}
		else if (BMI >= 24.9 && BMI <29.9) {
			n = 3;
		}
		else {
			n = 4;
		}
	}
	
	void printRecord() {
		switch (n) {
		case 1:
			System.out.println("Underweight");
			System.out.println("BMI : "+BMI);
			break;
		
		case 2:
			System.out.println("Normal weight");
			System.out.println("BMI : "+BMI);
			break;
		
		case 3:
			System.out.println("Overweight");
			System.out.println("BMI : "+BMI);
			break;
		
		case 4:
			System.out.println("Obese");
			System.out.println("BMI : "+BMI);
			break;
		}
		
	}
	
}

public class T3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BMITracker b1 = new BMITracker();
		//b1.acceptRecord();
		b1.calculateBMI();
		b1.classifyBMI();
		b1.printRecord();
	}

}

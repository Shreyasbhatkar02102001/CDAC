package c_java;
import java.util.Scanner;
public class Bmi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Weight : ");
		double weight = sc.nextDouble();
		System.out.print("Enter Height (in meters)  : ");
		double height = sc.nextDouble();
		
		double bmi = weight / (height * height);
//		System.out.println(bmi);
		
		if (bmi < 18.5) {
			System.out.println("Under weight");
		}
		else if (bmi < 25) {
			System.out.println("Normal weight");
		}
		else if (bmi < 30) {
			System.out.println("Over weight");
		}
		else {
			System.out.println("Obese");
		}
		sc.close();
	}

}

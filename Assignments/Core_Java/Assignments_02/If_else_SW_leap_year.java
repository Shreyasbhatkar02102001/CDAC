package c_java;

import java.util.Scanner;

public class If_else_SW_leap_year {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter year : ");
		int n = sc.nextInt();
		int result;
		
		if ((n % 4 == 0)&&(n % 100 != 0) || (n % 400 == 0)) {
			result = 1;
		}
		else {
			result = 0;
		}
		
		switch (result) {
		case 1: {
			System.out.println("Leap year");
			break;
		}
		case 0:{
			System.out.println("Not a Leap year");
			break;
		}
		default:
			System.out.println("Invail input");
			break;
		}
		sc.close();
		

	}

}

package p2;

import java.util.Scanner;

public class Prime_No {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter : ");
		int n = sc.nextInt(),ans=1;
		
		if ( n <= 1) {
			ans = 0;
		}
		else if ( n == 2 || n == 3 ) {
			ans = 1;
		}
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if ( n % i == 0) {
				ans = 0;
				break;
			}
		}
		
		if (ans == 1) {
			System.out.println(n+" is a prime number");
		}
		else {
			System.out.println(n+" is not a prime number");
		}
	}

}

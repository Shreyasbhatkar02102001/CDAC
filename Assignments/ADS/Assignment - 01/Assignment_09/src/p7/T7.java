package p7;

import java.util.Scanner;

public class T7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int n = sc.nextInt();
		int m=n,c=0, compare = n;
		
		while (m > 0) {
			m = m/10;
			c++;
		}
		m = 0;
		int rev =0;
		
		for (int i = 0; i < c; i++) {
			m = n % 10;
			rev = rev * 10 + m ;
			n = n / 10;
			
		}
		
		if (rev == compare ) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
	}
}
